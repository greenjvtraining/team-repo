package com.example.simpleBbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {

	@GetMapping("/mypage")
	public String userMain() {
		return "/user/mypage";
	}
}
