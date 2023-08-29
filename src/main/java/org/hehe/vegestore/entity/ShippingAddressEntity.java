package org.hehe.vegestore.entity;


import javax.persistence.*;

@Entity(name = "shippingaddress")
public class ShippingAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity userID;

    @Column(name = "address_line")
    private String addressLine;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private int postalCode;

    public ShippingAddressEntity() {
    }

    public ShippingAddressEntity(int id, UsersEntity userID, String addressLine, String city, int postalCode) {
        this.id = id;
        this.userID = userID;
        this.addressLine = addressLine;
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
