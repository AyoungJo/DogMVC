package com.spring.dogmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import com.spring.dog2.impl.DogDAO;
import com.spring.dog2.service.DogDO;

//어노테이션 기반
//@Controller
public class DogInsertProcController{
	
	@RequestMapping(value="dogInsertProc.do")
	public String dogInsertProc(DogDO ddo) {
		
		System.out.println("DogInsertProcController:dogInsertProc()");
		
		System.out.println("name : " + ddo.getName());
		System.out.println("host : " + ddo.getHost());
		System.out.println("breed : " + ddo.getBreed());
		System.out.println("sex : " + ddo.getSex());
		System.out.println("age : " + ddo.getAge());
		
		DogDAO ddao = new DogDAO();
		ddao.insertDog(ddo);
		
		return "redirect:dogList.do";
	}
}

//xml 설정파일 기반
//public class DogInsertProcController implements Controller {
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request,
//									HttpServletResponse response) throws Exception {
//		System.out.println("DogInsertProcController() 시작");
//
//		String name = request.getParameter("name");
//		String host = request.getParameter("host");
//		String breed = request.getParameter("breed");
//		String sex = request.getParameter("sex");
//		int age = Integer.parseInt(request.getParameter("age"));
//		
//		DogDO ddo = new DogDO();
//		ddo.setName(name);
//		ddo.setHost(host);
//		ddo.setBreed(breed);
//		ddo.setSex(sex);
//		ddo.setAge(age);
//		
//		DogDAO ddao = new DogDAO();
//		ddao.insertDog(ddo);
//
//		ModelAndView mav = new ModelAndView();
//		
//		mav.setViewName("redirect:dogList.do");
//		
//		return mav;	
//		
//	}
//}

