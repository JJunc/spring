package kr.co.jhta.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

/*
 * @Alias("타입별칭")
 *  + 매퍼파일에서 사용할 클래스의 별칭을 지정한다.
 *  + 아래와 같이 @Alias("User")라고 설정하고 나면
 *  	<insert id="insertUser" parameterType="kr.co.jhta.vo.User">
 *  		parameterType 속성에 클래스의 전체이름 대신 별칭을 지정할 수 있다.
 *  		<insert id="insertUser" parameterType="User">
 *  
 *  	<select id="getUserById" resultType="kr.co.jhta.vo.User">
 *  		resultType 속성에 클래스의 전체이름 대신 별칭을 지정할 수 있다.
 *  		<select id="getUserById" resultType="User">
 */
//@Alias("User")
public class User {
	
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private Date createdDate;
	private Date updatedDate;
	
	
	public User() {
		super();
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
