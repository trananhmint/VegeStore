package org.hehe.vegestore.payload.response;

public class ShippingAdressResponse {
    private String addressLine;
    private String city;
    private int postalCode;

    public ShippingAdressResponse() {
    }

    public ShippingAdressResponse(String addressLine, String city, int postalCode) {
        this.addressLine = addressLine;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
