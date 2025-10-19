package com.poly.lab4.Controller4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home/index")
    public String index() {
        return "/home/index";
    }

    @GetMapping("/home/about")
    public String about() {
        return "/home/about";
    }
}
