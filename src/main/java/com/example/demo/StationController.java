package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationController {
    @RequestMapping(name = "/stations", method=RequestMethod.GET)
    public Station station(@RequestParam(value="stationId") String stationId) {
        return new Station("testId","testName",true,"testSign");
    }
}
