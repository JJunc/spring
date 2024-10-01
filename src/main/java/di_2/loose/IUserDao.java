package di_2.loose;

import di_1.none.User;

/*
 * 사용자정보에 대한 CRUD 기능에 
 */
public interface IUserDao {
	
	void insertUser(User user);
	void deleteUser(int no);
	
}
