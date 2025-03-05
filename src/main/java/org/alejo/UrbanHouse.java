package org.alejo;

public class UrbanHouse implements IHouseType {
    private int floors;
    private boolean inGatedCommunity;

    public UrbanHouse(int floors, boolean inGatedCommunity) {
        this.floors = floors;
        this.inGatedCommunity = inGatedCommunity;
    }

    @Override
    public String getType() {
        return "Urban House";
    }

    public double calculateAdministrationFee() {
        return floors * 50000;
    }
}