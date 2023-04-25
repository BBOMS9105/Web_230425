package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/test1") // url
	public String test1() {   // 메소드 이름
		System.out.println("/test1 실행");
		return "test1";		  // JSP 이름
	}
	
	@RequestMapping("/json")	// 들어가는 주소
	@ResponseBody // 클래스같은녀석(return에 문자열을 출력함)
	public String test2() {
		System.out.println("/json 실행");
		
		
		return "{'key1' : 'value1', 'key2' : 'value2'}"; // ResponseBody때문에 
														 // 문자열을 반환함
	}
	
	@RequestMapping("/ajax") // url
	public String ajax() {   // 메소드 이름
		return "/sub/ajax";	  // JSP 이름(경로)
	}

}