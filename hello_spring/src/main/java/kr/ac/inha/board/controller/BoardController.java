package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ctrl + shift + o : import 정리
@RestController
public class BoardController {
	
	@RequestMapping("/inha")
	public String inha(String param) {
		return param+"inha.ac.kr";
	}
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 : "+id;
	}
	@RequestMapping("/hello")
	public String hello(int num) {
		String html = "";
		for(int i=0;i<10;i++) {
			var result = num*i;
			html += num+"*"+i+"="+ result + "\n"; 
		}
		return html;
	}
}
