package com.dbzz.matchingproject.dto.response;

import com.dbzz.matchingproject.entity.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductResponseDto {
    private Long productId;
    private String productName;
    private int price;
    private String productInfo;

    public ProductResponseDto(Product product) {
        this.productId = product.getProductId();
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.productInfo = product.getProductInfo();
    }

//    public ProductResponseDto(String userId, Product product) {
//        this.userId = product.getUserId();
//        this.productName = product.getProductName();
//        this.price = product.getPrice();
//        this.productInfo = product.getProductInfo();
//    }
}
