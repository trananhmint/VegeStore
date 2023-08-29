package org.hehe.vegestore.entity;


import javax.persistence.*;

@Entity(name = "OrderItems")
public class OrderItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private OrdersEntity orderID;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductsEntity productID;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_price")
    private float unitPrice;

    @Column(name = "total_price")
    private float totalPrice;

    public OrderItemsEntity() {
    }

    public OrderItemsEntity(int id, OrdersEntity orderID, ProductsEntity productID, int quantity, float unitPrice, float totalPrice) {
        this.id = id;
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
