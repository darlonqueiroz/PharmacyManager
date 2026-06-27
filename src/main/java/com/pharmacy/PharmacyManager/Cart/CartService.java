package com.pharmacy.PharmacyManager.Cart;

import org.springframework.stereotype.Service;

@Service
public class CartService {
    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
}
