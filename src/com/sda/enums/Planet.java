package com.sda.enums;

public enum Planet {
    MERCURY("huge","Mercury",40000L),
    VENUS("love","Venus",300000L),
    EARTH("life","Earth",0),
    JUPITER("gas","Jupiter",20000L),
    URANUS("metan", "Uranus",700000L),
    PLUTO("small","Pluto",200000L),
    NEPTUNE("huge","Neptune",100000L),
    PLUTO2("small","Pluto",200000L);

    private String size;
    private String name;
    private long distanceFromEarth;

    Planet(String size, String name,long distanceFromEarth) {
        this.size = size;
        this.name = name;
        this.distanceFromEarth=distanceFromEarth;
    }

    @Override
    public String toString() {
        return name + " " + size;
    }

    public long getDistanceFromEarth() {
        return distanceFromEarth;
    }
}
