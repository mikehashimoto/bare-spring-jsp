package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BareController {

	@GetMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("message", "Hello, World!");

		return "index";
	}

}