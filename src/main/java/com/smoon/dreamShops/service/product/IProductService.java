package com.smoon.dreamShops.service.product;

import com.smoon.dreamShops.dto.ProductDto;
import com.smoon.dreamShops.model.Product;
import com.smoon.dreamShops.request.AddProdcutRequest;
import com.smoon.dreamShops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProdcutRequest product);

    Product getProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    void deleteProduct(Long id);

    List<Product> getAlProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName (String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
