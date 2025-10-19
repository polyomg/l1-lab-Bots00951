package com.poly.controller;

import com.poly.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @GetMapping("/product/form")
    public String form() {
        return "product";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute Product p, Model model) {
        model.addAttribute("name", p.getName());
        model.addAttribute("price", p.getPrice());
        return "product";
    }
}