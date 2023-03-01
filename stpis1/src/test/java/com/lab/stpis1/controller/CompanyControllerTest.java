package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Company;
import com.lab.stpis1.repository.CompanyRepository;
import org.junit.jupiter.api.Test;
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
@WebMvcTest(CompanyController.class)
class CompanyControllerTest {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CompanyRepository companyRepository;
    @Test
    void findAllCompanies() throws Exception {
        when(companyRepository.findAll()).thenReturn(Arrays.asList(
                new Company(2L, "address1","bik1","fio_director1","name_company1", "rekvizity1"),
                new Company(3L, "address2","bik2","fio_director2","name_company2", "rekvizity2"),
                new Company(4L, "address3","bik3","fio_director3","name_company3", "rekvizity3")
                ));

        mockMvc.perform(get("/company/all"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[*].id_company", containsInAnyOrder(2,3,4)))
                .andExpect(jsonPath("$[*].bik", containsInAnyOrder("fio_director1","fio_director2","fio_director3")));
    }

    @Test
    void findOne() throws Exception {
        when(companyRepository.findById(anyLong())).thenReturn(Optional.of(
                new Company(2L, "address1","bik1","fio_director1","name_company1", "rekvizity1")));

        mockMvc.perform(get("/company/one/2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_company", containsInAnyOrder(2)))
                .andExpect(jsonPath("$.bik", containsInAnyOrder("fio_director1")));
    }

    @Test
    void createCompany() throws Exception {
        Company company = new Company(2L, "address1","bik1","fio_director1","name_company1", "rekvizity1");
        when(companyRepository.save(company)).thenReturn(company);
        mockMvc.perform(
                        post("/company/post")
                                .content(objectMapper.writeValueAsString(company))
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_company", containsInAnyOrder(2)))
                .andExpect(jsonPath("$.bik", containsInAnyOrder("fio_director1")));
    }

    @Test
    void updateCompany() throws Exception {
        Company company = new Company(2L, "address1","bik1","fio_director1","name_company1", "rekvizity1");
        when(companyRepository.save(company)).thenReturn(company);
        mockMvc.perform(
                        put("/company/put")
                                .content(objectMapper.writeValueAsString(company))
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id_company", containsInAnyOrder(2)))
                .andExpect(jsonPath("$.bik", containsInAnyOrder("fio_director1")));
    }

    @Test
    void deleteCompany() throws Exception {
        Company company = new Company(2L, "address1","bik1","fio_director1","name_company1", "rekvizity1");
        when(companyRepository.findById(anyLong())).thenReturn(Optional.of(company));
        mockMvc.perform(
                        delete("/company/del/2"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}