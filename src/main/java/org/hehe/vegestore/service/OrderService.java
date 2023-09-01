package org.hehe.vegestore.service;

import org.hehe.vegestore.entity.*;
import org.hehe.vegestore.payload.request.CartItemRequest;
import org.hehe.vegestore.payload.request.CartRequest;
import org.hehe.vegestore.payload.response.*;
import org.hehe.vegestore.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ShippingAddressRepository shippingAddressRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentStatusRepository paymentStatusRepository;

    public List<OrderResponse> getAll() {
        List<OrdersEntity> list = orderRepository.findAll();
        List<OrderResponse> listResponse = new ArrayList<>();
        for (OrdersEntity entity : list) {
            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setId(entity.getId());
            orderResponse.setOrderDate(entity.getOrderDate());
                UsersResponse usersResponse = new UsersResponse();
                usersResponse.setId(entity.getUser().getId());
                usersResponse.setEmail(entity.getUser().getEmail());
                usersResponse.setUsername(entity.getUser().getUserName());
            orderResponse.setUsersResponse(usersResponse);
            orderResponse.setTotalAmount(entity.getTotalAmount());
                OrderStatusResponse orderStatusResponse = new OrderStatusResponse();
                orderStatusResponse.setDescription(entity.getOrderStatus().getDescription());
            orderResponse.setOrderStatusResponse(orderStatusResponse);
                PaymentResponse paymentResponse = new PaymentResponse();
                for (PaymentEntity paymentEntity : entity.getPayments()) {
                    paymentResponse.setPaymentDate(paymentEntity.getPaymentDate());
                    paymentResponse.setPaymentMethod(paymentEntity.getPaymentMethod());
                    paymentResponse.setPaymentStatus(paymentEntity.getPaymentStatus().getDescription());
                }
            orderResponse.setPaymentResponse(paymentResponse);
                ShippingAdressResponse shippingAdressResponse = new ShippingAdressResponse();
                shippingAdressResponse.setAddressLine(entity.getShippingAddress().getAddressLine());
                shippingAdressResponse.setCity(entity.getShippingAddress().getCity());
                shippingAdressResponse.setPostalCode(entity.getShippingAddress().getPostalCode());
            orderResponse.setShippingAdressResponse(shippingAdressResponse);
                List<OrderItemsEntity> listOrderItems = orderItemRepository.findByOrder(entity);
                List<OrderItemResponse> listOrderItemResponse = new ArrayList<>();
                for (OrderItemsEntity orderItemsEntity : listOrderItems) {
                    OrderItemResponse orderItemResponse = new OrderItemResponse();
                        ProductsResponse productsResponse = new ProductsResponse();
                        productsResponse.setProductID(orderItemsEntity.getProduct().getId());
                        productsResponse.setName(orderItemsEntity.getProduct().getName());
                        productsResponse.setQuantity(orderItemsEntity.getProduct().getQuantity());
                        productsResponse.setPrice(orderItemsEntity.getProduct().getPrice());
                        productsResponse.setImageURL(orderItemsEntity.getProduct().getImageURL());
                        productsResponse.setDescription(orderItemsEntity.getProduct().getDescription());
                    orderItemResponse.setProductsResponse(productsResponse);
                    orderItemResponse.setQuantity(orderItemsEntity.getQuantity());
                    listOrderItemResponse.add(orderItemResponse);
                }
            orderResponse.setListOrderItems(listOrderItemResponse);
            listResponse.add(orderResponse);
        }
        return listResponse;
    }

    public boolean addNewOrder(CartRequest cartRequest) {
        try {
            //Adding new order
            OrdersEntity ordersEntity = new OrdersEntity();
                UsersEntity usersEntity = new UsersEntity();
                usersEntity.setUserName(cartRequest.getUserRequest().getFirstName() + cartRequest.getUserRequest().getLastName());
                usersEntity.setPhone(cartRequest.getUserRequest().getPhone());
                usersEntity.setEmail(cartRequest.getUserRequest().getEmail());
                usersEntity.setFirstName(cartRequest.getUserRequest().getFirstName());
                usersEntity.setLastName(cartRequest.getUserRequest().getLastName());
                StatusEntity statusEntity = new StatusEntity();
                statusEntity.setId(1);
                usersEntity.setStatus(statusEntity);
                UsersEntity userEntity = usersRepository.saveAndFlush(usersEntity);
            ordersEntity.setUser(userEntity);
                OrderStatusEntity orderStatusEntity = new OrderStatusEntity();
                orderStatusEntity.setId(1);
            ordersEntity.setOrderStatus(orderStatusEntity);
            float totalAmount = 0;
            for (CartItemRequest request : cartRequest.getListCartItem()) {
                totalAmount += request.getProductsResquest().getPrice() * request.getQuantity();
            }
            ordersEntity.setTotalAmount(totalAmount);
                //Add new shipping address for user
                ShippingAddressEntity shippingAddressEntity1 = new ShippingAddressEntity();
                shippingAddressEntity1.setUser(userEntity);
                shippingAddressEntity1.setAddressLine(cartRequest.getShippingAddressRequest().getAddressLine());
                shippingAddressEntity1.setCity(cartRequest.getShippingAddressRequest().getCountry());
                shippingAddressEntity1.setPostalCode(cartRequest.getShippingAddressRequest().getPostalCode());
                ShippingAddressEntity shippingAddress = shippingAddressRepository.saveAndFlush(shippingAddressEntity1);
            ordersEntity.setShippingAddress(shippingAddress);
            OrdersEntity orderEntity = orderRepository.saveAndFlush(ordersEntity);

            //Add new payment
            PaymentEntity paymentEntity = new PaymentEntity();
            paymentEntity.setOrder(orderEntity);
            paymentEntity.setPaymentMethod(cartRequest.getPaymentRequest().getDescription() );
                PaymentStatusEntity paymentStatusEntity = new PaymentStatusEntity();
                paymentStatusEntity.setId(1);
                paymentEntity.setPaymentStatus(paymentStatusEntity);
                paymentEntity.setPaymentAmount(totalAmount);
                paymentRepository.saveAndFlush(paymentEntity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
