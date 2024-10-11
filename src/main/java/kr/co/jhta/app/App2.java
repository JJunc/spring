package kr.co.jhta.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.mapper.UserMapper;
import kr.co.jhta.vo.User;

public class App2 {
	public static void main(String[] args) {
		
		ApplicationContext ctx 
		= new ClassPathXmlApplicationContext("context/context.xml");
		
		UserMapper userMapper = ctx.getBean(UserMapper.class);
//		User user = new User();
//		user.setId("kang");
//		user.setPassword("zxcv1234");
//		user.setName("강감찬");
//		user.setEmail("kang@gmail.com");
//		userMapper.insertUser(user);
		User user1 = userMapper.getUserById("hong");
		System.out.println("아이디: " + user1.getId());
		List<User> user2 = userMapper.getUserByName("홍길동");

		User user3 = userMapper.getUserByNo(1);
		System.out.println("번호: " + user3.getNo());
		List<User> users = userMapper.getAllUsers();
		for(User u : users) {
			System.out.println(u.getName());
		}
	}
	
	
}
