package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
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

    public List<Platform> freePlatforms(LocalDateTime time){
        List<Platform> freePlatforms = new ArrayList<>();

        for (Platform platform:platforms) {
            if(!platform.isFree() || time != platform.getTravel().getDeparture()){
                freePlatforms.add(platform);
            }
        }
        return platforms;
    }

}
