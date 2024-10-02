package di_6.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private EmpDao empDao;
	private DeptDao deptDao;
	private JobDao jobDao;
	
	@Autowired
	public EmployeeService(EmpDao empDao, DeptDao deptDao, JobDao jobDao) {
		this.empDao = empDao;
		this.deptDao = deptDao;
		this.jobDao = jobDao;
	}
	
	
}
