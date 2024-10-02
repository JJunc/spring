package di_6.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
	
	private DeptDao deptDao;
	private EmpDao empDao;
	
	@Autowired
	public DeptService(DeptDao deptDao, EmpDao empDao) {
		super();
		this.deptDao = deptDao;
		this.empDao = empDao;
	}
	
	
}
