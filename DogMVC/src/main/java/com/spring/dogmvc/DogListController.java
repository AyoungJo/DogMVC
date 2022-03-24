package com.spring.dogmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import com.spring.dog2.impl.DogDAO;
import com.spring.dog2.service.DogDO;

//������̼� ���
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


//xml �������� ���
//public class DogListController implements Controller{
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, 
//									  HttpServletResponse response) throws Exception {
//		System.out.println("DogListController ���� !!");
//		
//		//1. DO, DAO �̿��Ͽ� DB ���� �� ó��
//		DogDO ddo = new DogDO();
//		DogDAO ddao = new DogDAO();
//		
//		ArrayList<DogDO> dlist = ddao.getDogList();
//		
//		//2. ModelAndview�� �̿��Ͽ� ����ʿ� ������ ���� �� ��� ȣ��
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("dlist", dlist);
//		
//		mav.setViewName("GetDogListView"); 
//		
//		return mav;
//	}
//	
//}

