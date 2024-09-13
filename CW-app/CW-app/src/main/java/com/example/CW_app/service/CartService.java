package com.example.CW_app.service;

import com.example.CW_app.data.Cart;
import com.example.CW_app.data.CartRepository;
import com.example.CW_app.data.Cart;
import com.example.CW_app.data.CartRepository;

import com.example.CW_app.data.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CartService {
    @Autowired                   // Spring container inject dependancies into below reference variable at runtime
    private CartRepository cartRepository;

    public List<Cart> getCartItemsByUserID(int userid)
    {
        return cartRepository.findCartItemsByUserid(userid);
    }

    public Cart addCartItem(Cart cart){
        return cartRepository.save(cart);
    }
}
