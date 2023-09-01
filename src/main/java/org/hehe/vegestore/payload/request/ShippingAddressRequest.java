package org.hehe.vegestore.payload.request;

public class ShippingAddressRequest {
    private String country;
    private String addressLine;
    private int postalCode;

    public ShippingAddressRequest() {
    }

    public ShippingAddressRequest(String country, String addressLine, int postalCode) {
        this.country = country;
        this.addressLine = addressLine;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
