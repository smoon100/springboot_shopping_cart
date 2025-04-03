package com.smoon.dreamShops.service.cart;

import com.smoon.dreamShops.model.CartItem;

public interface ICartItemService {
    void addItemToCart(Long cartId, Long productId, int quantity);
    void removeItemFromCart(Long CartId, Long ProductId);
    void updateItemQuantiry(Long cartId, Long productionId, int quantity);

    CartItem getCartItem(Long cartId, Long productId);
}
