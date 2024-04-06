package com.mavenproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {
	@RequestMapping("/Maven1")
	public String display() {
		return "viewpage1";
	}
}
