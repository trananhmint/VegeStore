package org.hehe.vegestore.entity;


import javax.persistence.*;

@Entity(name = "OrderItems")
public class OrderItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemID;

    @ManyToOne
    @JoinColumn(name = "OrderID", insertable = false, updatable = false)
    private OrdersEntity orderID;

    @ManyToOne
    @JoinColumn(name = "ProductID", insertable = false, updatable = false)
    private ProductsEntity productID;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "UnitPrice")
    private float unitPrice;

    @Column(name = "TotalPrice")
    private float totalPrice;

    public OrderItemsEntity() {
    }

    public OrderItemsEntity(int orderItemID, OrdersEntity orderID, ProductsEntity productID, int quantity, float unitPrice, float totalPrice) {
        this.orderItemID = orderItemID;
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public int getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(int orderItemID) {
        this.orderItemID = orderItemID;
    }

    public OrdersEntity getOrderID() {
        return orderID;
    }

    public void setOrderID(OrdersEntity orderID) {
        this.orderID = orderID;
    }

    public ProductsEntity getProductID() {
        return productID;
    }

    public void setProductID(ProductsEntity productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
