package di_1.none;

public class UserDao {
	public void insertUser(User user) {
		System.out.println("UserDao의 InsertUser()");
		System.out.println(user.getNo()+ ", " + user.getName());
	}
	
	public void deleteUser(int no) {
		System.out.println("UserDao의 deleteUser()");
		System.out.println(no);
	}
}
