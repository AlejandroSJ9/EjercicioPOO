package org.alejo;

public class FamilyApartment implements IApartmentType {
    private boolean hasAdministrationFee;

    public FamilyApartment(boolean hasAdministrationFee) {
        this.hasAdministrationFee = hasAdministrationFee;
    }

    @Override
    public String getType() {
        return "Family Apartment";
    }
}