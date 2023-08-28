package org.hehe.vegestore.service.imp;

import org.hehe.vegestore.payload.request.ProductsResquest;
import org.hehe.vegestore.payload.response.ProductsResponse;

import java.util.List;

public interface IProductsService {
     ProductsResponse getDetailProduct(int id);

     boolean addProduct(ProductsResquest productsResquest);

    List<ProductsResponse> getProductByCategoryId(String hostName, int id);

}
