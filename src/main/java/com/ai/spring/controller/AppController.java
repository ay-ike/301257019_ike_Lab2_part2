package com.ai.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Amanda Ike (301257019)
*
**/
@Controller
public class AppController {
	@RequestMapping("/")
    public String home(Model model)
    {
		String display_msg = "Welcome to COMP367";
		model.addAttribute("display_msg", display_msg);
        return "index";
    }
}
