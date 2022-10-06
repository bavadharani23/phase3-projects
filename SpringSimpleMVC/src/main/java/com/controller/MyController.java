package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // this class like a servlet
public class MyController {
	@RequestMapping(value="hello" ,method=RequestMethod.GET)
	public ModelAndView sayHello()
	{
		ModelAndView mav=new ModelAndView();
		System.out.println("I came here");
		mav.setViewName("display1.jsp"); //RD Forward
		return mav;
		
	}
	
	@RequestMapping(value="hi" ,method=RequestMethod.GET)
	public ModelAndView sayHi()
	{
		ModelAndView mav=new ModelAndView();
		System.out.println("I came here");
		mav.setViewName("display.jsp"); //RD Forward
		return mav;
		
	}

}
