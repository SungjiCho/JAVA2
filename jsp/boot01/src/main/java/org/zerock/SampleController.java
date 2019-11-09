package org.zerock;

import org.springframework.web.bind.annotation.*;

@RestController  //REST 방식의 컨트롤러입니다.
public class SampleController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello world";
	}
	
	@GetMapping("/sample")
	public SampleVO makeSample() {
		
		SampleVO vo = new SampleVO();
		vo.setVal1("v1");
		vo.setVal2("v2");
		vo.setVal3("v3");
		
		System.out.println(vo);
		
		return vo;
	}
	
}
