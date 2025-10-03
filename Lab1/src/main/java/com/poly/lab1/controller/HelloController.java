package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
public class HelloController {
	@RequestMapping("/poly/hello")
	public String sayHello(Model model) {
		model.addAttribute("title","FPT Polytechnic");
		model.addAttribute("subject","Spring Boot MVC - TS00951 - Lê Hoàng Đăng Cử");
		return "hello";
	}
}
