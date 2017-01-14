package com.qingjie.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//http://localhost:8080/hello?name=didi
	private Logger logger = Logger.getLogger(getClass());

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello(@RequestParam String name) {
		logger.debug(name);
		return "Hello " + name;
	}
}
