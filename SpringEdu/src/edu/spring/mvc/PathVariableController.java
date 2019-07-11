package edu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	@RequestMapping("/board/{seqNo}.do")
	public String getBoard(@PathVariable String seqNo, ModelMap model) {
		model.addAttribute("seqNo", seqNo);
		return "board";
	}
}