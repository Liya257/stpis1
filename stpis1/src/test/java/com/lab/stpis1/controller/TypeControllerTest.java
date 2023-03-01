package com.lab.stpis1.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lab.stpis1.entity.Type;
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
@WebMvcTest(TypeController.class)
class TypeControllerTest {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TypeRepository typeRepository;
    @Test
    void findAllCompanies() throws Exception{
        when(typeRepository.findAll()).thenReturn(Arrays.asList(
                new Type(9L, "testMock1"),
                new Type(11L, "testMock2")
        ));

        mockMvc.perform(get("/type/all"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[*].id_type", containsInAnyOrder(9,11)))
                .andExpect(jsonPath("$[*].name_transport", containsInAnyOrder("testMock1","testMock2")));
    }

    @Test
    void findOne() throws Exception{
        when(typeRepository.findById(anyLong())).thenReturn(Optional.of(new Type(9L, "testMock1")));

        mockMvc.perform(get("/type/9"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_type", equalTo(9)))
                .andExpect(jsonPath("$.name_transport", equalTo("testMock1")));
    }

    @Test
    void createCompany() throws Exception {
        Type type = new Type(114L, "TestMock5");
        when(typeRepository.save(type)).thenReturn(type);
        mockMvc.perform(
                post("/type/post")
                        .content(objectMapper.writeValueAsString(type))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_type", equalTo(114)))
                .andExpect(jsonPath("$.name_transport", equalTo("TestMock5")));
    }

    @Test
    void updateCompany() throws Exception {
        Type type = new Type(114L, "TestMock5");
        when(typeRepository.save(type)).thenReturn(type);
        mockMvc.perform(
                        put("/type/put")
                                .content(objectMapper.writeValueAsString(type))
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_type", equalTo(114)))
                .andExpect(jsonPath("$.name_transport", equalTo("TestMock5")));

    }

    @Test
    void deleteCompany() throws Exception {
        Type type = new Type(121L, "TestMock3");
        when(typeRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(type));
        mockMvc.perform(
                delete("/type/del/121"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}