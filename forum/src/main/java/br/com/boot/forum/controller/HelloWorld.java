package br.com.boot.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
		
	@RequestMapping("/")
	@ResponseBody //identifica que o return não irá redirecionar para uma página "hello world"
	public String hello() {
		return "hello world!";
	}
}
