package com.spring.dogmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

//어노테이션 기반
//@Controller
public class DogInsertController{
	
	@RequestMapping(value="/dogInsert.do")
	public String dogInsert() {
		
		System.out.println("DogInsertController:dogInsert()");
		
		return "InsertDogView";
	}
}

//xml 설정파일 기반
//public class DogInsertController implements Controller{
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request,
//									HttpServletResponse response) throws Exception {
//		
//		System.out.println("DogInsertController ()");
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("InsertDogView");		
//		
//		return mav;
//	}
//}

