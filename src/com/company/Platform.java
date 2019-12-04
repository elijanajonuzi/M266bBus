package com.company;

import java.time.LocalDateTime;

public class Platform {
    private int platformNumber;
    private double platformSize;
    private boolean isBusServiceInternational;
    private boolean isSmall;
    private Travel travel;
    private boolean isFree;

    public Platform(){}


    public Platform(int platformNumber, double platformSize, Travel travel){
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;

        this.travel = travel;
        if(travel.getBus().isSingleDecker()==true){
            this.isBusServiceInternational = false;
            this.isSmall = true;
        }
        else {
            this.isBusServiceInternational = true;
            this.isSmall = false;
        }
         isFree=false;
    }

    public Platform(int platformNumber, double platformSize, boolean isSmall) {
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.isSmall = isSmall;
        travel = new Travel();
        isFree=true;
    }

    public Platform(int platformNumber, double platformSize, boolean isBusServiceInternational, boolean isSmall, boolean isOccupied, Travel travel) {
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.isBusServiceInternational = isBusServiceInternational;
        this.isSmall = isSmall;
        this.travel = travel;
        isFree=false;
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

    public boolean isFree() {
        return isFree;
    }

    public Platform setFree(boolean free) {
        isFree = free;
        return this;
    }

    @Override
    public String toString() {
        return "platformNumber=" + platformNumber +
                ", platformSize=" + platformSize ;
    }
}
