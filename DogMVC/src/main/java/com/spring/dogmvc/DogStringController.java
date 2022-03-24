package com.spring.dogmvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dog2.impl.DogDAO;
import com.spring.dog2.service.DogDO;

@Controller
public class DogStringController {

	@RequestMapping(value="/dogInsert.do")
	public String dogInsert() {
		
		System.out.println(" --> DogInsertController : dogInsert()");
		
		return "InsertDogView";
	}
	
	@RequestMapping(value="dogInsertProc.do", method=RequestMethod.GET)
	public String dogInsertProc(DogDO ddo) {
		
		System.out.println("--> DogInsertProcController : dogInsertProc()");
		
		System.out.println("name : " + ddo.getName());
		System.out.println("host : " + ddo.getHost());
		System.out.println("breed : " + ddo.getBreed());
		System.out.println("sex : " + ddo.getSex());
		System.out.println("age : " + ddo.getAge());
		
		DogDAO ddao = new DogDAO();
		ddao.insertDog(ddo);
		
		return "redirect:dogList.do";
	}
	
	@RequestMapping(value="dogList.do")
	public String dogListController(DogDO ddo, DogDAO ddao, Model model) {
		
		System.out.println("--> DogListController : dogListController()");
		
		ArrayList<DogDO> dlist = ddao.getDogList();
		
		model.addAttribute("dlist", dlist);
		
		return "GetDogListView";		
	}
	
}



