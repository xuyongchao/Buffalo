package com.buffalo.userface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buffalo.extend.util.R;

@Controller
public class IndexController {

	@RequestMapping({"/", "index"})
	public String index(Model model) {
		model.addAttribute("msg", "hello!");
		return R.Views.INDEX;
	}
	
}
