package org.alejo;

public class RuralHouse implements IHouseType {
    private double distanceToTown;
    private double altitudeAboveSeaLevel;

    public RuralHouse(double distance, double altitude) {
        this.distanceToTown = distance;
        this.altitudeAboveSeaLevel = altitude;
    }

    @Override
    public String getType() {
        return "Rural House";
    }

    public String getLocation() {
        return "Distance: " + distanceToTown + " km, Altitude: " + altitudeAboveSeaLevel + " m";
    }
}