package org.hehe.vegestore.payload.response;

import java.util.Date;

public class PaymentResponse {
    private String paymentMethod;
    private Date paymentDate;
    private String paymentStatus;

    public PaymentResponse() {
    }

    public PaymentResponse(String paymentMethod, Date paymentDate, String paymentStatus) {
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
