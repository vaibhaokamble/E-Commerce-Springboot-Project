package org.vaibhao.vk.ecommercesprinboot.payload;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private  Long productId;
    @NotBlank(message = "Product name is required")
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String productName;
    private String image;
    @NotBlank(message = "Product description is required")
    @Size(min = 6, message = "Product description must contain at least 6 characters")
    private String description;
    @NotNull(message = "Product quantity is required")
    @PositiveOrZero(message = "Quantity cannot be negative")
    private Integer quantity;
    @NotNull(message = "Product price is required")
    @Positive(message = "Price must be greater than 0")
    private Double price;
    @NotNull(message = "Discount is required")
    @DecimalMin(value = "0.0", message = "Discount cannot be less than 0")
    @DecimalMax(value = "100.0", message = "Discount cannot be greater than 100")
    private Double discount;
    @PositiveOrZero(message = "Special price cannot be negative")
    private Double specialPrice;
}
