package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//Spring은 POJO 기반을 기본방침으로 하고 있어서 
//특별한 경우가 아니면 특정 기술을 위한 상위클래스를 상속받지 않는다
// 메서드 단독 매핑 : 메서드 명 앞에 @requestmapping 정보를 기술
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam String name) {
		// ModelAndView : 스프링에서 응답을 다루는 가장 기본적인 객체
		//모델로 사용할 객체들(Attribute) 
		//View로 사용할 객체(JSP, Servlet)정보를 반환하는 객체
		ModelAndView mav = new ModelAndView();
		// 모델 설정
		// 서블릿에서 req.setAttribute 와 같은 의미
		mav.addObject("message", "Hello, " + name);
		//view 정보 설정
		mav.setViewName("/WEB-INF/views/hello.jsp");
		
		return mav;
	
	}
	// return 타입이 string일 경우
	// 기본적으로는 view의 이름을 리턴하는 것
	@RequestMapping("hello2")
	public String hello2() {
		//요청을 hello.jap로 foward 하는 것
		return "WEB-INF/views/hello.jsp";
		
	}
	//return 타입이 string 인데 응답에 직접 리턴된 내용을 직접 출력하고자 하는 경우
	//@resposeBody
	@ResponseBody
	@RequestMapping ("/hello3")
	public String hello3() {
		return "<h1>hello</h1>";
	}
	
	
}












