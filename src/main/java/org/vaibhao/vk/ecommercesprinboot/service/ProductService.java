package org.vaibhao.vk.ecommercesprinboot.service;

import org.springframework.web.multipart.MultipartFile;
import org.vaibhao.vk.ecommercesprinboot.payload.ProductDTO;
import org.vaibhao.vk.ecommercesprinboot.payload.ProductResponse;

import java.io.IOException;

public interface ProductService {
    ProductDTO addProduct(ProductDTO productDTO, Long categoryId);

    ProductResponse getAllProducts();

    ProductResponse searchCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO updateProduct(Long productId, ProductDTO productDTO);

    ProductDTO deleteProduct(Long productId);

    ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;
}
