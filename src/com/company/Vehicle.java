package com.company;

public abstract class Vehicle {
    private boolean isSingleDecker;
    private int passengerCapacity;
    private boolean isComfortBasic;

    public Vehicle(boolean isSingleDecker, int passengerCapacity, boolean isComfortBasic) {
        this.isSingleDecker = isSingleDecker;
        this.passengerCapacity = passengerCapacity;
        this.isComfortBasic = isComfortBasic;
    }


    public boolean isSingleDecker() {
        return isSingleDecker;
    }

    public void setSingleDecker(boolean singleDecker) {
        isSingleDecker = singleDecker;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isComfortBasic() {
        return isComfortBasic;
    }

    public void setComfortBasic(boolean comfortBasic) {
        isComfortBasic = comfortBasic;
    }
}


