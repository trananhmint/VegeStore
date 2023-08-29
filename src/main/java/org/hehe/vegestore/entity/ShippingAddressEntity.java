package org.hehe.vegestore.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "shippingaddress")
public class ShippingAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    @Column(name = "address_line")
    private String addressLine;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private int postalCode;

    @OneToMany(mappedBy = "shippingAddress")
    private Set<OrdersEntity> orders;

    public ShippingAddressEntity() {
    }

    public ShippingAddressEntity(int id, UsersEntity user, String addressLine, String city, int postalCode) {
        this.id = id;
        this.user = user;
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

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
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
