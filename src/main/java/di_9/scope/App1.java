package di_9.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class App1 {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SampleDao dao1 = ac.getBean(SampleDao.class);
		SampleDao dao2 = ac.getBean(SampleDao.class);
		SampleDao dao3 = ac.getBean(SampleDao.class);
		SampleDao dao4 = ac.getBean(SampleDao.class);
		SampleDao dao5 = ac.getBean(SampleDao.class);
		
		System.out.println("dao1: " + dao1);
		System.out.println("dao2: " + dao2);
		System.out.println("dao3: " + dao3);
		System.out.println("dao4: " + dao4);
		System.out.println("dao5: " + dao5);
	}
}
