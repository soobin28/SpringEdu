package edu.spring.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestParamController {
	@RequestMapping(value = "list1", method = RequestMethod.GET)
	@ResponseBody // <= jsp없이 html출력
	public String list1(@RequestParam("nowPage") int nowPage, @RequestParam("text") String text) {
		return "nowPage : " + nowPage + ", test : " + text;
	}
	
	@RequestMapping(value = "list2", method = RequestMethod.GET)
	@ResponseBody // <= jsp없이 html출력
	public String list2(
			@RequestParam(name= "nowPage", defaultValue="1") int nowPage, 
			@RequestParam(name= "text", required=false) String text) {
		return "nowPage : " + nowPage + ", test : " + text;
	}
	
	@RequestMapping(value = "list3", method = RequestMethod.GET)
	@ResponseBody // <= jsp없이 html출력
	public String list3(
			@RequestParam Map<String, Object> map) {
		return map.toString();
	}
}