package org.hehe.vegestore.entity;


import javax.persistence.*;

@Entity(name = "ShippingAddress")
public class ShippingAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shippingAddressID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UsersEntity userID;

    @Column(name = "AddressLine")
    private String addressLine;

    @Column(name = "City")
    private String city;

    @Column(name = "PostalCode")
    private int postalCode;

    public ShippingAddressEntity() {
    }

    public ShippingAddressEntity(UsersEntity userID, String addressLine, String city, int postalCode) {
        this.userID = userID;
        this.addressLine = addressLine;
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getShippingAddressID() {
        return shippingAddressID;
    }

    public void setShippingAddressID(int shippingAddressID) {
        this.shippingAddressID = shippingAddressID;
    }

    public UsersEntity getUserID() {
        return userID;
    }

    public void setUserID(UsersEntity userID) {
        this.userID = userID;
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
