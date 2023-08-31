package org.hehe.vegestore.controller;

import org.hehe.vegestore.payload.response.BaseResponse;
import org.hehe.vegestore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart/api/v1")
@CrossOrigin
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllCart() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatusCode(200);
        baseResponse.setMessage("OK");
        baseResponse.setData(cartService.getAll());
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
}
