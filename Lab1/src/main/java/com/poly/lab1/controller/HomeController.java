package com.poly.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/poly")
    public String index() {
        return "index"; // trả về index.html
    }
}
