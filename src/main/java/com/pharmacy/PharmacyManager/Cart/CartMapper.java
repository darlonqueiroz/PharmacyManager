package com.pharmacy.PharmacyManager.Cart;

import org.springframework.stereotype.Component;

@Component
public class CartMapper {

    public CartModel mapCart (CartDTO cartDTO) {

        CartModel cartModel = new CartModel();
        cartModel.setId(cartDTO.getId());
        cartModel.setFreight(cartDTO.getFreight());
        cartModel.setProduct(cartDTO.getProduct());
        cartModel.setTotalPrice(cartDTO.getTotalPrice());
        return cartModel;
    }

    public CartDTO mapCartDTO (CartModel cartModel) {

        CartDTO cartDTO = new CartDTO();
        cartDTO.setId(cartModel.getId());
        cartDTO.setFreight(cartModel.getFreight());
        cartDTO.setProduct(cartModel.getProduct());
        cartDTO.setTotalPrice(cartModel.getTotalPrice());
        return cartDTO;
    }
}
