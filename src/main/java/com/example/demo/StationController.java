package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StationController {

    @GetMapping("/stations")
    public List<Station> station() {
        List<Station> stations = new ArrayList<>();
        stations.add(new Station("testId","testName",true,"testSign"));

        return stations;
    }
}
