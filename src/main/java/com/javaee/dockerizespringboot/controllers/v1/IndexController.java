package com.javaee.dockerizespringboot.controllers.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(IndexController.BASE_URL)
public class IndexController {

public static final String BASE_URL = "/api/v1/index";
	
	@GetMapping
	public String home() {
		return "Home Principal";
	}
}
