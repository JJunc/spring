package di_9.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	
	@Bean
	/*
	 * 스프링 빈의 스코프
	 * 	+ 빈의 스코프는 스프링 컨테이너가 생성한 빈의 유효 범위를 말한다.
	 *  + 빈의 유효범위는 5가지가 있다.
	 *  + 빈의 기본 유효범위는 "singleton"이다.
	 *  + 유효범우의 종류
	 *  	- singleton
	 *  		+ 스프링 빈의 기본 유효범위다.
	 *  		+ 스프링 컨테이너내에 오직 하나의 객체만 존재한다.
	 *  	- prototype
	 *  	- request
	 *  	- session
	 *  	- application
	 *  @Scope("prototype")
	 *  @Scope("singleton")
	 */
	public SampleDao sampleDao() {
		return new SampleDao();
	}
}
