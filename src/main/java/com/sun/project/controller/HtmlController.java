/**
 * 
 */
package com.sun.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.project.config.AuthUserDatabaseShardingAlgorithm;

/**
 * @author sunchangjunn
 * 2018年11月27日下午4:25:14
 */
@Controller
public class HtmlController {
	
	private static final Logger logger = LoggerFactory.getLogger(HtmlController.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("跳转index页面");		
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		logger.info("跳转login页面");		
		return "login";
	}

}
