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

    public Travel(String destination, LocalDateTime arrival, LocalDateTime departure, boolean isInternational) {
        this.destination = destination;
        this.arrival = arrival;
        this.departure = departure;
        this.isInternational = isInternational;
    }

    public String getDestination() {
        return destination;
    }

    public Travel setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public Travel setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
        return this;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public Travel setDeparture(LocalDateTime departure) {
        this.departure = departure;
        return this;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public Travel setInternational(boolean international) {
        isInternational = international;
        return this;
    }

    public Vehicle getBus() {
        return bus;
    }

    public void setBus(Vehicle bus) {
        this.bus = bus;
    }
}
