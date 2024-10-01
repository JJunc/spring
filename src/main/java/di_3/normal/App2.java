package di_3.normal;

import di_1.none.User;

public class App2 {
	public static void main(String[] args) {
		Container container = new Container();
		container.createAndAssemble();
		
		UserService2 service =(UserService2) container.getBean("userService");
		
		service.회원가입(new User(1, "김유신", "kim@gmail.com"));
	}
}
