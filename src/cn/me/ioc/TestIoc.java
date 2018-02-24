package cn.me.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	@Test
	public void testUser() {
		// 加载spring配置文件 根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
		user.add();
	}

}
