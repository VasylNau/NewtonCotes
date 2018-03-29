package edu.lpnu.cad.newtoncotes.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class BaseControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    private BaseController baseController;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(baseController).build();
    }

    @Test
    public void getIndexPage() throws Exception {
         mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(forwardedUrl("index"))
                .andReturn();
    }

}
