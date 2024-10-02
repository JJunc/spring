package di_6.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HRService {
	
	private EmployeeService employeeService;
	private DeptService deptService;
	private JobService jobService;
	
	@Autowired
	public HRService(EmployeeService employeeService, DeptService deptService, JobService jobService) {
		this.employeeService = employeeService;
		this.deptService = deptService;
		this.jobService = jobService;
	}
	
}
