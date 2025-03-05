package org.alejo;

public abstract class RealEstate {
    private String id;
    private Float area;
    private String address;
    private Float value;
    private Integer stratum;

    public Float calculatePredialTax(Float tax){
        return this.value * tax;
    }

}
