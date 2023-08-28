package org.hehe.vegestore.service;

import org.hehe.vegestore.entity.CategoryEntity;
import org.hehe.vegestore.entity.ProductsEntity;
import org.hehe.vegestore.payload.request.ProductsResquest;
import org.hehe.vegestore.payload.response.ProductsResponse;
import org.hehe.vegestore.repository.ProductsRepository;
import org.hehe.vegestore.service.imp.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductsService implements IProductsService {
    @Autowired
    ProductsRepository productsRepository;

    @Override
    public ProductsResponse getDetailProduct(int id) {
        Optional<ProductsEntity> product = productsRepository.findById(id);
        ProductsResponse productResponse = new ProductsResponse();
        if(product.isPresent()){
            productResponse.setProductID(product.get().getProductID());
            productResponse.setImageURL(product.get().getImageURL());
            productResponse.setPrice(product.get().getPrice());
            productResponse.setName(product.get().getName());
            productResponse.setDescription(product.get().getDescription());
        }

        return productResponse;
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
            categoryEntity.setCategoryID(productsResquest.getCategoryID());

            productsEntity.setCategoryID(categoryEntity);

            productsRepository.save(productsEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
