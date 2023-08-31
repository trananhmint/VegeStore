package org.hehe.vegestore.service;

import org.hehe.vegestore.entity.CartEntity;
import org.hehe.vegestore.entity.CartItemsEntity;
import org.hehe.vegestore.payload.response.CartItemResponse;
import org.hehe.vegestore.payload.response.CartResponse;
import org.hehe.vegestore.repository.CartItemRepository;
import org.hehe.vegestore.repository.CartRepository;
import org.hehe.vegestore.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductsService productsService;

    public List<CartResponse> getAll() {
        List<CartResponse> listCartResponse = new ArrayList<>();
        List<CartEntity> listCart = cartRepository.findAll();
        for (CartEntity cart : listCart) {
            CartResponse cartResponse = new CartResponse();
            cartResponse.setId(cart.getId());
            List<CartItemResponse> listCartItemResponse = new ArrayList<>();
            List<CartItemsEntity> listCartItem = cartItemRepository.findByCart(cart);
            for (CartItemsEntity cartItemsEntity : listCartItem) {
                CartItemResponse cartItemResponse = new CartItemResponse();
                cartItemResponse.setId(cartItemsEntity.getId());
                cartItemResponse.setProductsResponse(productsService.getDetailProduct(cartItemsEntity.getProduct().getId()));
                cartItemResponse.setQuantity(cartItemsEntity.getQuantity());
                listCartItemResponse.add(cartItemResponse);
            }
            cartResponse.setListCartItems(listCartItemResponse);
        }
        return listCartResponse;
    }


}
