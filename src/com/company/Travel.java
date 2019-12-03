package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Travel {
    private String destination;
    private LocalDateTime arrival;
    private LocalDateTime departure;
    private boolean isInternational;
    private Vehicle bus;

    public Travel(){}

    public Travel(String destination, LocalDateTime arrival, LocalDateTime departure, boolean isInternational, Vehicle bus) {
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

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
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
