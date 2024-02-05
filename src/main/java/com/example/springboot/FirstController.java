package com.example.springboot;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class FirstController {
        @GetMapping("/")
    public String index(Model model) {
            ArrayList<Product> products = new ArrayList<>();
            products.add(new Product(1, "Курс 1 JAVA", 2000, "Jaба", "1.png"));
            products.add(new Product(2, "Курс 2 HTML CSS JS", 3000, "Fullstack", "2.png"));
            products.add(new Product(3, "Курс 3 C#/C++", 4000, "CиСи+Си#", "3.png"));
            products.add(new Product(4, "Курс 4 1C", 5000, "1С это кто", "4.png"));

            model.addAttribute("products", products);

            return "index";
        }
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id, Model model) {
        Product selectedProduct = getProductById(id);
        model.addAttribute("selectedProduct", selectedProduct);

        return "product";
    }

    private Product getProductById(int id) {
        return new Product(id, "Курс " + id, 1000 + id * 1000, "Описание курса " + id, id + ".png");
    }

    @PostMapping("/addComment/")
    public String addComment(@RequestParam long productId, @RequestParam String comment) {
        System.out.println("Комментарий к товару с ID " + productId + ": " + comment);
        return "product";
    }
    }
