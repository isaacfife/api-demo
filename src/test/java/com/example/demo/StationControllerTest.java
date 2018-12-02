package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value = StationController.class, secure = false)
public class StationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAllStations() throws Exception
    {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/stations").accept(MediaType.APPLICATION_JSON);
        MvcResult actual = mockMvc.perform(requestBuilder).andReturn();
        String expected = "[{\"stationId\":\"testId\",\"name\":\"testName\",\"hdEnabled\":true,\"callSign\":\"testSign\"}]";

        JSONAssert.assertEquals(expected, actual.getResponse()
                .getContentAsString(), false);
    }
}
