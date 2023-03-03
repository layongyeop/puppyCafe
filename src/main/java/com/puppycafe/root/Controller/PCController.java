package com.puppycafe.root.Controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PCController {

	@Autowired
	SqlSession sqlSession;
	// 메인
	@RequestMapping(value = "/")
	public String main() {
		
		return "index";
	}
	//메인
	@RequestMapping(value = "/index")
	public String index() {
		
		return "index";
	}
	//카페 소개
	@RequestMapping(value = "/cafeInfo")
	public String cafeInfo() {
		
		return "cafeInfo";
	}
	//예약
	@RequestMapping(value = "/reserved")
	public String reserved() {
		
		return "reserved";
	}
	//펫종류
	@RequestMapping(value = "/pet")
	public String pet() {
		
		return "pet";
	}
	//커뮤니티
	@RequestMapping(value = "/community")
	public String community() {
		
		return "commnuity";
	}
	//로그인
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	//로그아웃
	@RequestMapping(value = "/logout")
	public String logout() {
		
		return "index";
	}
	//회원가입
	@RequestMapping(value = "/join")
	public String join() {
		
		return "login";
	}
	
}
