package jdbc.vo;

import jdbc.vo.Employee.EmployeeBuilder;

public class App2 {
	public static void main(String[] args) {
		EmployeeBuilder builder = Employee.builder();
		builder.id(10)
			.firstName("홍")
			.lastName("길동")
			.email("hong@gmail.com")
			.build();
		
		Employee emp2 = Employee.builder()
					.id(100)
					.firstName("홍")
					.build();
		
		Employee emp3 = Employee.builder()
					.id(100)
					.firstName("홍")
					.lastName("길동")
					.build();
		
		Employee emp4 = Employee.builder()
					.firstName("홍")
					.id(100)
					.build();
	}
}
