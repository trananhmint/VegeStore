package org.hehe.vegestore.service;

import org.hehe.vegestore.entity.CategoryEntity;
import org.hehe.vegestore.entity.ProductsEntity;
import org.hehe.vegestore.payload.request.ProductsResquest;
import org.hehe.vegestore.payload.response.ProductsResponse;
import org.hehe.vegestore.repository.ProductsRepository;
import org.hehe.vegestore.service.imp.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsService implements IProductsService {
    @Autowired
    ProductsRepository productsRepository;

    @Override
    public ProductsResponse getDetailProduct(int id) {
        Optional<ProductsEntity> productsEntity = productsRepository.findById(id);
        ProductsResponse productsResponse = null;
        if (productsEntity.isPresent()) {
            productsResponse = new ProductsResponse();
            productsResponse.setProductID(productsEntity.get().getId());
            productsResponse.setImageURL(productsEntity.get().getImageURL());
            productsResponse.setPrice(productsEntity.get().getPrice());
            productsResponse.setName(productsEntity.get().getName());
            productsResponse.setDescription(productsEntity.get().getDescription());
        }
        return productsResponse;
    }

    @Override
    public boolean addProduct(ProductsResquest productsResquest) {
        try {
            ProductsEntity productsEntity = new ProductsEntity();
            productsEntity.setName(productsResquest.getName());
            productsEntity.setImageURL(productsResquest.getImageURL());
            productsEntity.setPrice(productsResquest.getPrice());
            productsEntity.setQuantity(productsResquest.getQuantity());

            CategoryEntity categoryEntity = new CategoryEntity();
            categoryEntity.setId(productsResquest.getCategoryID());

            productsEntity.setCategory(categoryEntity);

            productsRepository.save(productsEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<ProductsResponse> getProductByCategoryId(int id) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(id);
        List<ProductsEntity> list = productsRepository.findByCategory(categoryEntity);
        List<ProductsResponse> listResponse = new ArrayList<>();
        for (ProductsEntity entity : list) {
            ProductsResponse response = new ProductsResponse();
            response.setName(entity.getName());
            response.setProductID(entity.getId());
            response.setDescription(entity.getDescription());
            response.setPrice(entity.getPrice());
            response.setImageURL(entity.getImageURL());
            response.setQuantity(entity.getQuantity());
            listResponse.add(response);
        }
        return listResponse;
    }

}
