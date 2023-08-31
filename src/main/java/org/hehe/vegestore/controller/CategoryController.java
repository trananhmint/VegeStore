package org.hehe.vegestore.controller;

import org.hehe.vegestore.payload.response.BaseResponse;
import org.hehe.vegestore.service.imp.ICategoryService;
import org.hehe.vegestore.service.imp.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public ResponseEntity<?> getAllCategory(){
        BaseResponse response = new BaseResponse();
        response.setStatusCode(200);
        response.setMessage("OK");
        response.setData(iCategoryService.getAllCategory());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
