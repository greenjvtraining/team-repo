package com.example.simpleBbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String root(Model model) {
		model.addAttribute("data", "Hello SimpleBbs");
		return "index";
	}
}
