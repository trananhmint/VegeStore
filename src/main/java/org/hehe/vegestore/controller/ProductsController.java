package org.hehe.vegestore.controller;

import org.hehe.vegestore.payload.response.BaseResponse;
import org.hehe.vegestore.service.imp.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductsController {

    @Autowired
    IProductsService iProductsService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getDetailProduct(@PathVariable int id){
        BaseResponse response = new BaseResponse();
        response.setData(iProductsService.getDetailProduct(id));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<?> getProductByCategory(@PathVariable int id){
        BaseResponse response = new BaseResponse();
        response.setData(iProductsService.getProductByCategoryId(id));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
