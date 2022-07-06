package com.spring.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.board.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	//怨듯넻 �쁺�뿭 : �떆�옉 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//怨듯넻 �쁺�뿭 : �걹 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	//�뭾�쁺 : �떆�옉 ==============================================
		@GetMapping(value = "/jeongsu")
		public String poonghyeok() {
			
			return "/board/poonghyeok";
		}
		
	//�뭾�쁺 : �걹 ==============================================

	//�젙�닔 : �떆�옉 ########################################
	
	
	//�젙�닔 : �걹 ##########	##############################
		
}
