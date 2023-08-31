package org.hehe.vegestore.payload.response;

public class OrderStatusResponse {
    private String description;

    public OrderStatusResponse() {
    }

    public OrderStatusResponse(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
