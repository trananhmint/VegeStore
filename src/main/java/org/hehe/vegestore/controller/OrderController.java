package org.hehe.vegestore.controller;

import org.hehe.vegestore.payload.request.CartRequest;
import org.hehe.vegestore.payload.response.BaseResponse;
import org.hehe.vegestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order/api/v1")
@CrossOrigin
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

    @PostMapping("/add-new-order")
    public ResponseEntity<?> addNewOrder(@RequestBody CartRequest cartRequest) {
        boolean addStatus = orderService.addNewOrder(cartRequest);
        BaseResponse baseResponse = new BaseResponse();
        if (addStatus) {
            baseResponse.setStatusCode(200);
            baseResponse.setMessage("Add successful");
            baseResponse.setData(null);
        } else {
            baseResponse.setStatusCode(400);
            baseResponse.setMessage("Add unsuccessful!");
            baseResponse.setData(null);
        }
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
}
