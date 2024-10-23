package model2.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.jhta.controller.HomeController;
import kr.co.jhta.controller.ProductListController;

@WebServlet(urlPatterns = "*.do")
public class FrontController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("### 프론트 컨트롤러: service(req, res) 실행됨");
		
		// 클라이언트의 요청 분석하기
		String uri = request.getRequestURI();
		System.out.println("### 프론트 컨트롤러: 요청 URI=" + uri);
		
		// 요청에 맞는 컨트롤러 실행하기

		
		// 컨트롤러의 메소드를 실행해서 요청 처리하기
		try {
			Controller controller = null;
			if ("/model2/home.do".equals(uri)) {
				controller = new HomeController();
			} else if ("/model2/product/list.do".equals(uri)) {
				controller = new ProductListController();
			} else if ("/model2/login.do".equals(uri)) {
//				controller = new LoginController();
			} else if ("/model2/logout.do".equals(uri)) {
//				controller = new LogoutController();
			}
			
			// 컨트롤러의 메소드를 실행해서 요청 처리하기
			String path = controller.exe(request, response);
			path = "/WEB-INF/views/" + path;
			System.out.println("### 프론트 컨트롤러가 이동할 경로: " + path);
			
			// 클라이언트의 요청을 이동시키기
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.forward(request, response);
			System.out.println("### 프론트 컨트롤러: ["+path+"]로 내부이동 시킨다" );
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		System.out.println("### 프론트 컨트롤러: service(req, res) 실행됨");
		System.out.println();
	}
	
}
