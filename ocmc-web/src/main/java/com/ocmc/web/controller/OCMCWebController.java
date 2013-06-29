package com.ocmc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class OCMCWebController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getChangeRequest(ModelMap model){
		model.addAttribute("message", "Welcome to OCMC Web!");
		
		return "hello";
	}
}
