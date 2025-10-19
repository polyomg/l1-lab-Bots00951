package com.poly.controller;

import com.poly.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class ProductController2 {
	// Danh sách sản phẩm tạm
    private List<Product> itemList = new ArrayList<>(Arrays.asList(
            new Product("A", 1.0),
            new Product("B", 12.0)
    ));

    // GET /product/form
    @GetMapping("/product2/form")
    public String form(Model model) {
        Product p = new Product("iPhone 30", 5000.0);

        model.addAttribute("p1", p);
        model.addAttribute("p2", null);
        model.addAttribute("items", itemList); // hiển thị danh sách hiện tại
        return "product2";
    }

    // POST /product/save
    @PostMapping("/product2/save")
    public String save(@ModelAttribute("p2") Product p, Model model) {
        // thêm sản phẩm mới vào danh sách
        itemList.add(p);

        model.addAttribute("p2", p);
        model.addAttribute("p1", new Product("iPhone 30", 5000.0));
        model.addAttribute("items", itemList); // cập nhật lại danh sách

        return "product2";
    }
}