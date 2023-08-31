package org.hehe.vegestore.controller;

import org.hehe.vegestore.payload.response.BaseResponse;
import org.hehe.vegestore.payload.response.ProductsResponse;
import org.hehe.vegestore.service.ProductsService;
import org.hehe.vegestore.service.imp.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/api/v1")
@CrossOrigin
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllProducts() {
        List<ProductsResponse> list = productsService.getAllProducts();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatusCode(200);
        baseResponse.setMessage("OK");
        baseResponse.setData(list);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDetailProduct(@PathVariable int id){
        BaseResponse response = new BaseResponse();
        response.setData(productsService.getDetailProduct(id));
        response.setStatusCode(200);
        response.setMessage("OK");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/get-by-category/{id}")
    public ResponseEntity<?> getProductByCategory(@PathVariable int id){
        BaseResponse response = new BaseResponse();
        response.setData(productsService.getProductByCategoryId(id));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
