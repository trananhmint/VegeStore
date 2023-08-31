package org.hehe.vegestore.controller;

import org.hehe.vegestore.payload.response.BaseResponse;
import org.hehe.vegestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/api/v1")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllOrders() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatusCode(200);
        baseResponse.setMessage("OK");
        baseResponse.setData(orderService.getAll());
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
}
