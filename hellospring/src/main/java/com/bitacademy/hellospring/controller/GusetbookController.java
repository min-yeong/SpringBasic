package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 타입 단독 매핑
@Controller
@RequestMapping("/guestbook/*")
public class GusetbookController {
	@RequestMapping
	@ResponseBody
	public String list() { //   /guestbook/list에 반응
		return "<h1>GuestBook:list</h1>";
	}
	@RequestMapping
	@ResponseBody
	public String add() { // /guestbook/add 에 반응
		return "<h1>Guestbook:add</h1>";
	}
}
