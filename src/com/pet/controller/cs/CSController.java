package com.pet.controller.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CSController {
	@RequestMapping(value="/cs/list", method=RequestMethod.GET)
	public String selectAll() {
		
		return "cs/list";
	}
}
