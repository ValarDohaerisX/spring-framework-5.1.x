package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

/**
 * @author lzx
 * @company 赞同科技
 * @date 2020/12/09 15:41
 * @Describetion
 */

public class ApplicationContextTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
}
