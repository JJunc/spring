package di_2.loose;

import di_1.none.User;

public class UserDaoOracle implements IUserDao{

	@Override
	public void insertUser(User user) {
		System.out.println("UserDaoOracle객체의 insertUser() 실행됨");
		System.out.println(user.getNo()+ ", " + user.getName());
	}

	@Override
	public void deleteUser(int no) {
		System.out.println("UserDaoOracle객체의 deleteUser() 실행됨");
		System.out.println(no);
	}
	
}
