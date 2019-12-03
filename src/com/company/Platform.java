package com.company;

import java.time.LocalDateTime;

public class Platform {
    private int platformNumber;
    private double platformSize;
    private boolean isBusServiceInternational;
    private String busService;
    private boolean isSmall;
    private Travel travel;


    public Platform(int platformNumber, double platformSize, String busService,Travel travel){
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.busService = busService;

        this.travel = travel;
        if(travel.getBus().isSingleDecker()==true){
            this.isBusServiceInternational = false;
            this.isSmall = true;
        }
        else {
            this.isBusServiceInternational = true;
            this.isSmall = false;
        }
    }

    public Platform(int platformNumber, double platformSize, String busService, boolean isSmall){
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.busService = busService;
        this.isSmall = isSmall;
    }
    public Platform(int platformNumber, double platformSize, boolean isSmall){
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.isSmall = isSmall;
    }

    public Platform(int platformNumber, double platformSize, boolean isBusServiceInternational, String busService, boolean isSmall, boolean isOccupied, Travel travel) {
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.isBusServiceInternational = isBusServiceInternational;
        this.busService = busService;
        this.isSmall = isSmall;
        this.travel = travel;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public double getPlatformSize() {
        return platformSize;
    }

    public void setPlatformSize(double platformSize) {
        this.platformSize = platformSize;
    }

    public boolean isBusServiceInternational() {
        return isBusServiceInternational;
    }

    public void setBusServiceInternational(boolean busServiceInternational) {
        isBusServiceInternational = busServiceInternational;
    }

    public String getBusService() {
        return busService;
    }

    public void setBusService(String busService) {
        this.busService = busService;
    }

    public boolean isSmall() {
        return isSmall;
    }

    public void setSmall(boolean small) {
        isSmall = small;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    @Override
    public String toString() {
        return "platformNumber=" + platformNumber +
                ", platformSize=" + platformSize +
                ", busService='" + busService;
    }
}
