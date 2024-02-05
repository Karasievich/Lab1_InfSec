package com.example.springboot;


import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;


@RestController
public class SecondController {
    private final ArrayList<Product> cartItems = new ArrayList<>();

    @PostMapping("/addToCart")
    public ArrayList<Product> addToCart(@RequestBody Product product) {
        cartItems.add(product);
        return cartItems;
    }

    @GetMapping("/cartItems")
    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

}