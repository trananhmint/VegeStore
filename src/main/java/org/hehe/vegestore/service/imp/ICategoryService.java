package org.hehe.vegestore.service.imp;

import org.hehe.vegestore.payload.request.CategoryResquest;
import org.hehe.vegestore.payload.response.CategoryResponse;

import java.util.List;

public interface ICategoryService {
    List<CategoryResponse> getAllCategory();

    boolean addProduct(CategoryResquest categoryResquest);
}
