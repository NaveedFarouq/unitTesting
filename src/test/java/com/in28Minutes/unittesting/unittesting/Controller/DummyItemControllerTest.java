package com.in28Minutes.unittesting.unittesting.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DummyItemController.class)
public class DummyItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void DummyItem_basic() throws Exception{
        //call GET hello-world url and get string hello world
        RequestBuilder request = MockMvcRequestBuilders.
                get("/dummy-item").
                accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quatity\":100}"))
                .andReturn();

        //verify string Hello World
        //assertEquals("Hello World", result.getResponse().getContentAsString());
    }


}