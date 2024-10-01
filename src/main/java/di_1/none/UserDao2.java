package di_1.none;

public class UserDao2 {
	public void addUser(User user) {
		System.out.println("UserDao의 addUser()");
		System.out.println(user.getNo()+ ", " + user.getName());
	}
	
	public void removeUser(int no) {
		System.out.println("UserDao의 removeUser()");
		System.out.println(no);
	}
}
