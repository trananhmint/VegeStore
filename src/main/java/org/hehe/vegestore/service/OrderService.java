package org.hehe.vegestore.service;

import org.hehe.vegestore.entity.OrdersEntity;
import org.hehe.vegestore.entity.PaymentEntity;
import org.hehe.vegestore.payload.response.*;
import org.hehe.vegestore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

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
            listResponse.add(orderResponse);
        }
        return listResponse;
    }
}
