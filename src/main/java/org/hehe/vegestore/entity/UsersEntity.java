package org.hehe.vegestore.entity;



import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "Users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column (name = "UserName")
    private String userName;

    @Column (name = "Password")
    private String password;

    @Column (name = "Email")
    private String email;

    @Column (name = "PhoneNo")
    private String phone;

    @Column (name = "DOB")
    private Date dob;

    @Column (name = "Gender")
    private String gender;

    @Column (name = "RegistrationDate")
    private Date registrationDate;

    @Column (name = "LastLoginDate")
    private Date lastLoginDate;

    @ManyToOne
    @JoinColumn(name = "StatusID")
    private StatusEntity statusID;

    @OneToMany(mappedBy = "creationUserID")
    private Set<CategoryEntity> creationCategory;

    @OneToMany(mappedBy = "lastUpdateUserID")
    private Set<CategoryEntity> lastUpdateCategory;

    @OneToMany(mappedBy = "creationUserID")
    private Set<ProductsEntity> creationProduct;

    @OneToMany(mappedBy = "lastUpdateUserID")
    private Set<ProductsEntity> lastUpdateProduct;

    @OneToMany(mappedBy = "userID")
    private Set<ReviewsEntity> userReview;

    @OneToMany(mappedBy = "userID")
    private Set<CartEntity> userCart;

    @OneToMany(mappedBy = "userID")
    private Set<OrdersEntity> userOrder;

    @OneToMany(mappedBy = "userID")
    private Set<ShippingAddressEntity> userShippingAddress;

    public UsersEntity() {
    }

    public UsersEntity(int userID, String firstName, String lastName, String userName, String password, String email, String phone, Date dob, String gender, Date registrationDate, Date lastLoginDate, StatusEntity statusID, Set<CategoryEntity> creationCategory, Set<CategoryEntity> lastUpdateCategory, Set<ProductsEntity> creationProduct, Set<ProductsEntity> lastUpdateProduct, Set<ReviewsEntity> userReview, Set<CartEntity> userCart, Set<OrdersEntity> userOrder, Set<ShippingAddressEntity> userShippingAddress) {
        this.userID = userID;
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
        this.statusID = statusID;
        this.creationCategory = creationCategory;
        this.lastUpdateCategory = lastUpdateCategory;
        this.creationProduct = creationProduct;
        this.lastUpdateProduct = lastUpdateProduct;
        this.userReview = userReview;
        this.userCart = userCart;
        this.userOrder = userOrder;
        this.userShippingAddress = userShippingAddress;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public StatusEntity getStatusID() {
        return statusID;
    }

    public void setStatusID(StatusEntity statusID) {
        this.statusID = statusID;
    }

    public Set<CategoryEntity> getCreationCategory() {
        return creationCategory;
    }

    public void setCreationCategory(Set<CategoryEntity> creationCategory) {
        this.creationCategory = creationCategory;
    }

    public Set<CategoryEntity> getLastUpdateCategory() {
        return lastUpdateCategory;
    }

    public void setLastUpdateCategory(Set<CategoryEntity> lastUpdateCategory) {
        this.lastUpdateCategory = lastUpdateCategory;
    }

    public Set<ProductsEntity> getCreationProduct() {
        return creationProduct;
    }

    public void setCreationProduct(Set<ProductsEntity> creationProduct) {
        this.creationProduct = creationProduct;
    }

    public Set<ProductsEntity> getLastUpdateProduct() {
        return lastUpdateProduct;
    }

    public void setLastUpdateProduct(Set<ProductsEntity> lastUpdateProduct) {
        this.lastUpdateProduct = lastUpdateProduct;
    }

    public Set<ReviewsEntity> getUserReview() {
        return userReview;
    }

    public void setUserReview(Set<ReviewsEntity> userReview) {
        this.userReview = userReview;
    }

    public Set<CartEntity> getUserCart() {
        return userCart;
    }

    public void setUserCart(Set<CartEntity> userCart) {
        this.userCart = userCart;
    }

    public Set<OrdersEntity> getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(Set<OrdersEntity> userOrder) {
        this.userOrder = userOrder;
    }

    public Set<ShippingAddressEntity> getUserShippingAddress() {
        return userShippingAddress;
    }

    public void setUserShippingAddress(Set<ShippingAddressEntity> userShippingAddress) {
        this.userShippingAddress = userShippingAddress;
    }

}
