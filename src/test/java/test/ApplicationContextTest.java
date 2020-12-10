package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Cat;
import pojo.User;

/**
 * @author lzx
 * @company 赞同科技
 * @date 2020/12/09 15:41
 * @Describetion
 */

public class ApplicationContextTest {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("pojo");
		User user = ac.getBean(User.class);
		Cat cat1 = ac.getBean(Cat.class);
		Cat cat2 =  ac.getBean(Cat.class);
		System.out.println(user);
		System.out.println(cat1 == cat2);
	}
}
