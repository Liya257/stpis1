package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Type;
import com.lab.stpis1.repository.TransportRepository;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lab.stpis1.entity.Transport;
import com.lab.stpis1.repository.TypeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(TransportController.class)
class TransportControllerTest {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransportRepository transportRepository;
    @Test
    void findAllCompanies() throws Exception {
        Type type = new Type(2L, "TestMock2");
        when(transportRepository.findAll()).thenReturn(Arrays.asList(
                new Transport(9L, true, 120, "black", "DT", 6.4, "125555ff", 1250.0, type),
                new Transport(11L, true, 120, "white", "DT", 6.4, "125555ff", 1250.0, type),
                new Transport(13L, true, 120, "red", "DT", 6.4, "125555ff", 1250.0, type)
        ));

        mockMvc.perform(get("/transport/all"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[*].id_transport", containsInAnyOrder(9,11,13)))
                .andExpect(jsonPath("$[*].color", containsInAnyOrder("black","white","red")));
    }

    @Test
    void findOne() throws Exception{
        Type type = new Type(2L, "TestMock2");
        when(transportRepository.findById(anyLong())).thenReturn(Optional.of(
                new Transport(9L, true, 120, "black", "DT", 6.4, "125555ff", 1250.0, type)));

        mockMvc.perform(get("/one/9"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_transport", equalTo(9)))
                .andExpect(jsonPath("$.color", equalTo("black")));
    }

    @Test
    void createCompany() throws Exception{
        Type type = new Type(2L, "TestMock2");
        Transport transport = new Transport(9L, true, 120, "black", "DT", 6.4, "125555ff", 1250.0, type);
        when(transportRepository.save(transport)).thenReturn(transport);
        mockMvc.perform(
                        post("/transport/post")
                                .content(objectMapper.writeValueAsString(transport))
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_transport", equalTo(9)))
                .andExpect(jsonPath("$.color", equalTo("black")));
    }

    @Test
    void updateCompany() throws Exception {
        Type type = new Type(2L, "TestMock2");
        Transport transport = new Transport(9L, true, 120, "black", "DT", 6.4, "125555ff", 1250.0, type);
        when(transportRepository.save(transport)).thenReturn(transport);
        mockMvc.perform(
                        put("/transport/put")
                                .content(objectMapper.writeValueAsString(transport))
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_transport", equalTo(9)))
                .andExpect(jsonPath("$.color", equalTo("black")));
    }

    @Test
    void deleteCompany() throws Exception {
        Type type = new Type(2L, "TestMock2");
        Transport transport = new Transport(9L, true, 120, "black", "DT", 6.4, "125555ff", 1250.0, type);
        when(transportRepository.findById(anyLong())).thenReturn(Optional.of(transport));
        mockMvc.perform(
                        delete("/transport/del/9"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}