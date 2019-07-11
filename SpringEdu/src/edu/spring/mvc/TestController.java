package edu.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("third")
	@ResponseBody 
	public String third() {
		return "<h1>Hello</h1>";
	}
	
	@RequestMapping("test/second")
	public String second(@RequestParam("user_id") String user_id, Model model) {
		return "second";
	}
	
	@RequestMapping("first")  // <- ������ �ּ�(URL)�� �޼ҵ�� �������ִ� ��.
	public ModelAndView first(HttpServletRequest req) { // �޼ҵ�� ����, �ߺ����� �ʰ�!
		String key = req.getParameter("key");
		System.out.println(key);
		
		// jsp view �̸��� ������ ������ ����
		ModelAndView mav = new ModelAndView();
		mav.setViewName("first");
		mav.addObject("data","Hello");
		return mav;  // <- View�� ���� jsp ���� ��
		// /WEB-INF/views/first.jsp
	}
}
