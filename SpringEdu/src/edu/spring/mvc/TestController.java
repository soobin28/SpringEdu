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
	
	@RequestMapping("first")  // <- 접속할 주소(URL)를 메소드와 매핑해주는 것.
	public ModelAndView first(HttpServletRequest req) { // 메소드명 자유, 중복되지 않게!
		String key = req.getParameter("key");
		System.out.println(key);
		
		// jsp view 이름과 데이터 정보를 담음
		ModelAndView mav = new ModelAndView();
		mav.setViewName("first");
		mav.addObject("data","Hello");
		return mav;  // <- View로 사용될 jsp 파일 명
		// /WEB-INF/views/first.jsp
	}
}
