package com.lcsuo.p2p.service.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAction {
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "test";
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	@ResponseBody
	public String testPost(String signature, String timeStamp ,String data) {
		System.out.println(signature+" = "+timeStamp +" = "+data);
		return "test";
	}

}
