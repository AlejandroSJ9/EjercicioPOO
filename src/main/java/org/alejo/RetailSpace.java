package org.alejo;

public class RetailSpace implements ICommercialType {
    private boolean isInternal;

    public RetailSpace(boolean isInternal) {
        this.isInternal = isInternal;
    }

    @Override
    public String getType() {
        return "Retail Space";
    }
}