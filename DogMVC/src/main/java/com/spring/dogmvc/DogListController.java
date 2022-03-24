package com.spring.dogmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import com.spring.dog2.impl.DogDAO;
import com.spring.dog2.service.DogDO;

//어노테이션 기반
//@Controller
public class DogListController{
	
	@RequestMapping(value="dogList.do")
	public ModelAndView dogListController(DogDO ddo, DogDAO ddao, ModelAndView mav) {
		
		System.out.println("DogListController:dogListController()");
		
		ArrayList<DogDO> dlist = ddao.getDogList();
		mav.addObject("dlist", dlist);
		
		mav.setViewName("GetDogListView");
		
		return mav;		
	}
}


//xml 설정파일 기반
//public class DogListController implements Controller{
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, 
//									  HttpServletResponse response) throws Exception {
//		System.out.println("DogListController 시작 !!");
//		
//		//1. DO, DAO 이용하여 DB 연동 및 처리
//		DogDO ddo = new DogDO();
//		DogDAO ddao = new DogDAO();
//		
//		ArrayList<DogDO> dlist = ddao.getDogList();
//		
//		//2. ModelAndview를 이용하여 뷰어쪽에 데이터 전달 및 뷰어 호출
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("dlist", dlist);
//		
//		mav.setViewName("GetDogListView"); 
//		
//		return mav;
//	}
//	
//}

