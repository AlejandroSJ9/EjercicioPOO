package org.alejo;

public class Apartment implements IHousingType {
    @Override
    public String getType() {
        return "Apartment";
    }

    public double calculateAdministrationFee() {
        return 150000;
    }
}