package com.springformvalid.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springformvalid.entities.loginData;

@Controller
public class MyController {
	@GetMapping("/loginform")
    public String form(Model model) {
		model.addAttribute("loginData", new loginData());
    return "loginform";
    }
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") loginData loginData, BindingResult result ) {
		if(result.hasErrors()) {
			System.out.println(result);
		    return "loginform";
		}
		
		System.out.println(loginData);
		return "success";
	}
}
