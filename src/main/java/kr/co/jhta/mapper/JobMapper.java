package kr.co.jhta.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.jhta.vo.Job;

@Mapper
public interface JobMapper {
	
	void insertJob(Job job);
	/*
	 *	void insertJob(@Param("x") Job job); 
	 * 	<insert id="insertJob>
	 * 		insert into jobs (job_id)
	 * 		values(#{x.id})
	 * 	</insert>
	 * 
	 * 	void insertJob(@Param("id") String id);
	 * 
	 * 	<insert id="insertJob>
	 * 		insert into jobs (job_id)
	 * 		values(#{id})
	 * 	</insert>
	 * 
	 */
	List<Job> getAllJobs();
	Job getJobById(String id);
	void updateJob(Job job);
	void deleteJobById(String id);
	

}
