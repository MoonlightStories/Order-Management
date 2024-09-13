package com.example.CW_app.controller;

import com.example.CW_app.data.Cart;
import com.example.CW_app.service.CartService;
import com.example.CW_app.data.Cart;

import com.example.CW_app.data.Order;
import com.example.CW_app.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController
{
    @Autowired
    private CartService cartService;


    @GetMapping("/carts/{userid}")
    public List<Cart> cartItemsByID(@PathVariable int userid) {
        return cartService.getCartItemsByUserID(userid);
    }

    @PostMapping(path = "/carts/add")
    public Cart addCartItem(@RequestBody Cart cart){
        return cartService.addCartItem(cart);
    }

}
