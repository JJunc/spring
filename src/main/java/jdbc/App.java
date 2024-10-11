package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc.dao.JobDao;
import jdbc.vo.Job;

public class App {
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("context/context.xml");
		
//		DataSource ds = ac.getBean(DataSource.class);
//		System.out.println("커넥션풀: " + ds);
//		
//		Connection con =  ds.getConnection();
//		System.out.println("커넥션션: " + con);
		
		JobDao jobDao = ac.getBean(JobDao.class);
		
		Job job1 = new Job();
//		job1.setId("기술지원");
//		job1.setTitle("기술지원 및 유지보수");
//		job1.setMinSalary(3000);
//		job1.setMaxSalary(6000);
//		
//		jobDao.insertJob(job1);
		List<Job> jobs = jobDao.getAllJobs();
		for(Job job : jobs) {
			System.out.println("----------------");
			System.out.println("직종 아이디: " + job.getId());
			System.out.println("직종명: " + job.getTitle());
			System.out.println("----------------");
			System.out.println();
		}
		
		Job job2 = jobDao.getJobById("기술지원");
		System.out.println(job2.getTitle());
		
	}
}
