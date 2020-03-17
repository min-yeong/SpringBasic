package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitacademy.hellospring.vo.UserVo;

// type + method의 결합 방식
@RequestMapping("/user")
@Controller
public class UserController {
	@RequestMapping("/joinform") // /user/joinform에 응답
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}
	// post 방식의 요청 받기
	//modelattribute 방식으로 파라미터를 받아봅시다
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@ModelAttribute UserVo user) {
		//로직 처리 진행 
		System.out.println("UserVo:" +user);
		// 리다이렉트
		return "redirect:/user/joinsuccess";
	}
	@ResponseBody
	@RequestMapping("/joinsuccess")
	public String joinsuccess() {
		return "<h1>Join Success</h1>";
	}
	
	
}
