/**
 * 
 */
package com.sun.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sunchangjunn
 * 2018年11月27日下午1:30:45
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("hello");
		
		return "ok";
	}
	
}
