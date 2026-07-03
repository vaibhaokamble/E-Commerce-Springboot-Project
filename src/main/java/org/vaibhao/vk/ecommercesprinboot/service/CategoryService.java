package org.vaibhao.vk.ecommercesprinboot.service;

import org.vaibhao.vk.ecommercesprinboot.payload.CategoryDTO;
import org.vaibhao.vk.ecommercesprinboot.payload.CategoryResponse;

public interface CategoryService {

    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
