package com.sri;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubtractController {
	@RequestMapping("/subtract")
	public ModelAndView subtract(HttpServletRequest request, HttpServletResponse response) {
		try{
			int i = Integer.parseInt(request.getParameter("t1"));		
			int j = Integer.parseInt(request.getParameter("t2"));
			int k = (i - j);
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("displaySubtract.jsp");
			mv.addObject("result", k);
			return mv;
		}catch (Exception e) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("errorPage.jsp");
			mv.addObject("error", e);
			return mv;
		}
	}

}
