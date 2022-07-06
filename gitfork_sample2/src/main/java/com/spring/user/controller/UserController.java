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


	@GetMapping(value = "/usedddrList122")
	public String userList122() {
		return "/user/usedddrList122";
		}
		@GetMapping(value = "/userList33")
	public String userList33() {
		return "/user/userList33";
	}
	//怨듯넻 : �떆�옉 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//�뿰�닔 : �떆�옉 ==============================================
	@GetMapping(value="/yeonsoo")
	public String yeonsoo() {
		System.out.println("연수님바보멍뚱이메롱");
		return "/user/yeonsoo";
	}
	//�뿰�닔 : �걹 ==============================================

	//�쑀吏� : �떆�옉 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	@GetMapping(value = "yoojin")
	public String yoojin() {

		System.out.println("유진수정0706또또수정이야수정이야!!!!!!!!!!!!!!!");

		return "/user/yoojin";
	}
	
	//�쑀吏� : �걹 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//湲곗쭊 : �떆�옉 ########################################
	@GetMapping(value = "/kijin")
	public String kijin222() {
		System.out.println();

		System.out.println("다녀감");

		return "/user/kijin";

		return "/user/kijifdfn";

	}
	
	//湲곗쭊 : �걹 ########################################
}
