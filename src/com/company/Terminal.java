package com.company;

import java.util.List;

public class Terminal {
    private String name;
    private List<Platform> platforms;

    public Terminal(String name, List<Platform> platforms) {
        this.name = name;
        this.platforms = platforms;
    }
    public Terminal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public void arrivals(){

    }

    public void departures(){
    }
}
