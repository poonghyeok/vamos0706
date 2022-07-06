package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.user.service.UserService;


@RequestMapping(value = "/user")

public class UserController {

	//怨듯넻 : �떆�옉 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	@GetMapping(value = "/userList")
	public String userList() {
		return "/user/userList";
		
	}
	
	@GetMapping(value = "/userList122")
	public String userList122() {
		return "/user/userList122";
		
	}
	
	@GetMapping(value = "/userList33")
	public String userList33() {
		return "/user/userList33";
	}
	//怨듯넻 : �떆�옉 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//�뿰�닔 : �떆�옉 ==============================================
	@GetMapping(value="/yeonsoo")
	public String yeonsoo() {
		return "/user/yeonsoo";
	}
	//�뿰�닔 : �걹 ==============================================

	//�쑀吏� : �떆�옉 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	@GetMapping(value = "yoojin")
	public String yoojin() {
		System.out.println("유진수정0706");
		return "/user/yoojin";
	}
	
	//�쑀吏� : �걹 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//湲곗쭊 : �떆�옉 ########################################
	@GetMapping(value = "/kijin")
	public String kijin() {
		System.out.println();
		System.out.println("이게  merge?");
		return "/user/kijin";
	}
	
	//湲곗쭊 : �걹 ########################################
}
