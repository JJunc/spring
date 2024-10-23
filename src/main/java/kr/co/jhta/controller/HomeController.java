package kr.co.jhta.controller;

import java.util.Date;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.jhta.vo.Notice;
import model2.controller.Controller;

/*
 * 요청 URL -> http://localhost/model2/home.do
 * 	+ 위의 요청 URL이 프론트 컨트롤러에 접수되면 이 컨트롤러를 실행한다.
 *  + 요청을 처리하고 나면 home.jsp를 응답한다.
 */
public class HomeController implements Controller{

	@Override
	public String exe(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("### 홈컨트롤러: exe(req, res) 실행됨");
		
		// JSP로 데이터 전달하기
		// 1. 기본자료형, 문자열 전달하기
		req.setAttribute("visitorCnt", 211);
		req.setAttribute("msg", "안녕하세요");
		
		// 2. 객체를 전달하기
		Notice notice = new Notice();
		notice.setNo(102);
		notice.setTitle("[긴급] 전 품목 50% 할인판매");
		notice.setContent("이월 상품 전제품 50% 할인된 가격으로 판매합니다.");
		notice.setCreatedDate(new Date());
		
		req.setAttribute("event", notice);
		
		System.out.println("### 홈컨트롤러: 요청을 처리함");
		
		System.out.println("### 홈컨트롤러: exe(req, res) 종료됨");
		
		return "home.jsp";
	}

}
