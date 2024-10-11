package jdbc.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import jdbc.vo.Job;

@Repository
public class JobDao {
	
	@Autowired
	private JdbcTemplate t;
	
	public void insertJob(Job job) {
		String sql = """
			insert into jobs
			(job_id, job_title, min_salary, max_salary)
			values
			(?,?,?,?)	
				""";
		t.update(sql, job.getId()
				, job.getTitle()
				, job.getMinSalary() 
				, job.getMaxSalary());
	}
	
	public List<Job> getAllJobs() {
		String sql = """
				select *
				from jobs
				order by job_id asc
				""";
		return t.query(sql, jobRowMapper());
	}
	
	public Job getJobById(String id) {
		String sql = """
				select *
				from jobs
				where job_id = ?
				""";
		return t.queryForObject(sql, jobRowMapper(), id);
	}
	
	public void updateJob(Job job) {
		String sql = """
				update jobs
				set
					job_title = ?
				where job_id = ?
				""";
		t.update(sql,
				job.getTitle());
	}
	
	public RowMapper<Job> jobRowMapper() {
		return (rs, rowNum) -> {
			Job job = new Job();
			job.setId(rs.getString("job_id"));
			job.setTitle(rs.getString("job_title"));
			job.setMinSalary(rs.getInt("MIN_SALARY"));
			job.setMaxSalary(rs.getInt("MAX_SALARY"));
			return job;
		};
	}
}
