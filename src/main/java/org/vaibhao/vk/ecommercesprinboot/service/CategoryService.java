package org.vaibhao.vk.ecommercesprinboot.service;

import org.vaibhao.vk.ecommercesprinboot.payload.CategoryDTO;
import org.vaibhao.vk.ecommercesprinboot.payload.CategoryResponse;

public interface CategoryService {

    CategoryResponse getAllCategories();

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
