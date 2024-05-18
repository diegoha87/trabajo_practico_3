package ar.edu.unju.fi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
	@GetMapping({"/index","/home","/","/inicio"})
	public String getIndex() {
		return "index";
	}

}
