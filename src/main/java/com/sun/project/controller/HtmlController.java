/**
 * 
 */
package com.sun.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunchangjunn
 * 2018年11月27日下午4:25:14
 */
@Controller
@RequestMapping("/html")
public class HtmlController {
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("跳转index页面");		
		return "index";
	}

}
