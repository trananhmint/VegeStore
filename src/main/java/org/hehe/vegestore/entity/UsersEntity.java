package org.hehe.vegestore.entity;



import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column (name = "username")
    private String userName;

    @Column (name = "password")
    private String password;

    @Column (name = "email")
    private String email;

    @Column (name = "phone_no")
    private String phone;

    @Column (name = "dob")
    private Date dob;

    @Column (name = "gender")
    private String gender;

    @Column (name = "registration_time")
    private Date registrationDate;

    @Column (name = "last_login_date")
    private Date lastLoginDate;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private StatusEntity status;

    @OneToMany(mappedBy = "creationUser")
    private Set<CategoryEntity> creationCategories;

    @OneToMany(mappedBy = "lastUpdateUser")
    private Set<CategoryEntity> lastUpdateCategories;

    @OneToMany(mappedBy = "creationUser")
    private Set<ProductsEntity> creationProducts;

    @OneToMany(mappedBy = "lastUpdateUser")
    private Set<ProductsEntity> lastUpdateProducts;

    @OneToMany(mappedBy = "user")
    private Set<ReviewsEntity> reviews;

    @OneToMany(mappedBy = "user")
    private Set<CartEntity> carts;

    @OneToMany(mappedBy = "user")
    private Set<OrdersEntity> orders;

    @OneToMany(mappedBy = "user")
    private Set<ShippingAddressEntity> shippingAddresses;

    public UsersEntity() {
    }

    public UsersEntity(int id, String firstName, String lastName, String userName, String password, String email, String phone, Date dob, String gender, Date registrationDate, Date lastLoginDate, StatusEntity status, Set<CategoryEntity> creationCategories, Set<CategoryEntity> lastUpdateCategories, Set<ProductsEntity> creationProducts, Set<ProductsEntity> lastUpdateProducts, Set<ReviewsEntity> reviews, Set<CartEntity> carts, Set<OrdersEntity> orders, Set<ShippingAddressEntity> shippingAddresses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.gender = gender;
        this.registrationDate = registrationDate;
        this.lastLoginDate = lastLoginDate;
        this.status = status;
        this.creationCategories = creationCategories;
        this.lastUpdateCategories = lastUpdateCategories;
        this.creationProducts = creationProducts;
        this.lastUpdateProducts = lastUpdateProducts;
        this.reviews = reviews;
        this.carts = carts;
        this.orders = orders;
        this.shippingAddresses = shippingAddresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public Set<CategoryEntity> getCreationCategories() {
        return creationCategories;
    }

    public void setCreationCategories(Set<CategoryEntity> creationCategories) {
        this.creationCategories = creationCategories;
    }

    public Set<CategoryEntity> getLastUpdateCategories() {
        return lastUpdateCategories;
    }

    public void setLastUpdateCategories(Set<CategoryEntity> lastUpdateCategories) {
        this.lastUpdateCategories = lastUpdateCategories;
    }

    public Set<ProductsEntity> getCreationProducts() {
        return creationProducts;
    }

    public void setCreationProducts(Set<ProductsEntity> creationProducts) {
        this.creationProducts = creationProducts;
    }

    public Set<ProductsEntity> getLastUpdateProducts() {
        return lastUpdateProducts;
    }

    public void setLastUpdateProducts(Set<ProductsEntity> lastUpdateProducts) {
        this.lastUpdateProducts = lastUpdateProducts;
    }

    public Set<ReviewsEntity> getReviews() {
        return reviews;
    }

    public void setReviews(Set<ReviewsEntity> reviews) {
        this.reviews = reviews;
    }

    public Set<CartEntity> getCarts() {
        return carts;
    }

    public void setCarts(Set<CartEntity> carts) {
        this.carts = carts;
    }

    public Set<OrdersEntity> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrdersEntity> orders) {
        this.orders = orders;
    }

    public Set<ShippingAddressEntity> getShippingAddresses() {
        return shippingAddresses;
    }

    public void setShippingAddresses(Set<ShippingAddressEntity> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }
}
