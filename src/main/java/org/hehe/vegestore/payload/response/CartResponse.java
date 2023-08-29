package org.hehe.vegestore.payload.response;

import java.util.List;

public class CartResponse {
    private int id;
    private List<CartItemResponse> listCartItems;

    public CartResponse() {
    }

    public CartResponse(int id, List<CartItemResponse> listCartItems) {
        this.id = id;
        this.listCartItems = listCartItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CartItemResponse> getListCartItems() {
        return listCartItems;
    }

    public void setListCartItems(List<CartItemResponse> listCartItems) {
        this.listCartItems = listCartItems;
    }
}
