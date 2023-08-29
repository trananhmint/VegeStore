package org.hehe.vegestore.service;

import org.hehe.vegestore.entity.CategoryEntity;
import org.hehe.vegestore.entity.UsersEntity;
import org.hehe.vegestore.payload.request.CategoryResquest;
import org.hehe.vegestore.payload.response.CategoryResponse;
import org.hehe.vegestore.repository.CategoryRepository;
import org.hehe.vegestore.service.imp.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponse> getAllCategory(){
        //Dữ liệu lấy được từ database
        List<CategoryEntity> list = categoryRepository.findAll();
        //Dữ liệu trả ra cho FE
        List<CategoryResponse> responseList = new ArrayList<>();
        for (CategoryEntity item : list ) {
            //Duyệt qua từng dòng dữ liệu query được từ CategorEntity
            CategoryResponse categoryResponse = new CategoryResponse();
            categoryResponse.setCategoryID(item.getId());
            categoryResponse.setName(item.getName());

            responseList.add(categoryResponse);
        }

        return responseList;

    }

    @Override
    public boolean addProduct(CategoryResquest categoryResquest) {
        try {
            CategoryEntity categoryEntity= new CategoryEntity();
            categoryEntity.setId(categoryResquest.getCategoryID());
            categoryEntity.setName(categoryResquest.getName());

            UsersEntity usersEntity = new UsersEntity();
            usersEntity.setId(categoryResquest.getCreationUserID());
            categoryEntity.setCreationUser(usersEntity);

            usersEntity.setId(categoryResquest.getLastUpdateUserID());
            categoryEntity.setLastUpdateUser(usersEntity);

            categoryEntity.setCreationTimestamp(categoryResquest.getCreationTimestamp());
            categoryEntity.setLastUpdateTimestamp(categoryResquest.getLastUpdateTimestamp());

            categoryRepository.save(categoryEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
