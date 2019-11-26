package com.company;

import java.util.Date;

public class Travel {
    private String destination;
    private String arrival;
    private String departure;
    private boolean isInternational;
    private Vehicle bus;

    public Travel(){}

    public Travel(String destination, String arrival, String departure, boolean isInternational, Vehicle bus) {
        this.destination = destination;
        this.arrival = arrival;
        this.departure = departure;
        this.isInternational = isInternational;
        this.bus = bus;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    public Vehicle getBus() {
        return bus;
    }

    public void setBus(Vehicle bus) {
        this.bus = bus;
    }
}
