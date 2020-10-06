package com.pappas.apifun.adapter;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pappas.apifun.test_objects.Builders;
import com.pappas.apifun.application.Happy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(EmotionalChangesController.class)
@ContextConfiguration(classes = EmotionalChangesControllerTest.ControllerConfiguration.class)
public class EmotionalChangesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @DisplayName("verify that 200 and a deserializable Happy Object is returned when requested")
    @Test
    public void happyPath() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/happiness")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        Happy returnedHappy = objectMapper.readValue(result.getResponse().getContentAsString(), Happy.class);
        assertThat(returnedHappy).isEqualTo(Builders.buildHappy());

    }

    @TestConfiguration
    @ComponentScan("com.pappas.apifun.application")
    public static class ControllerConfiguration {
    }


}