package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Station {
    @Id
    private String stationId;
    private String name;
    private Boolean hdEnabled;
    private String callSign;

    public Station(String stationId, String name, Boolean hdEnabled, String callSign) {
        this.stationId = stationId;
        this.name = name;
        this.hdEnabled = hdEnabled;
        this.callSign = callSign;
    }

    public String getStationId() {
        return stationId;
    }

    public String getName() {
        return name;
    }

    public Boolean getHdEnabled() {
        return hdEnabled;
    }

    public String getCallSign() {
        return callSign;
    }
}
