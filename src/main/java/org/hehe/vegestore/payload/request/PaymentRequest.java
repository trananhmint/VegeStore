package org.hehe.vegestore.payload.request;

public class PaymentRequest {
    private String description;

    public PaymentRequest() {
    }

    public PaymentRequest(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
