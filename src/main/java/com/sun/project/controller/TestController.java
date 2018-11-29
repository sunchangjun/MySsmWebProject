/**
 * 
 */
package com.sun.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.sun.project.dao.QmTsMapper;
import com.sun.project.entity.QmTs;

/**
 * @author sunchangjunn
 * 2018年11月27日下午1:30:45
 */
@Controller
@RequestMapping("/test")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	QmTsMapper qmTsMapper;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		logger.info("执行hello()");
		return "ok";
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select() {
		logger.info("执行select()");
	QmTs qmTs=	qmTsMapper.selectByPrimaryKey(1L);
	System.out.println(JSONObject.toJSONString(qmTs));
		
		return qmTs;
	}
	
}
