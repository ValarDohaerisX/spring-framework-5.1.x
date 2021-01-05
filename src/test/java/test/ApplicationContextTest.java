package test;

import context.MyClassPathXmlApplicationContext;
import pojo.User;

/**
 * @author lzx
 * @company 赞同科技
 * @date 2020/12/09 15:41
 * @Describetion
 */

public class ApplicationContextTest {
	public static void main(String[] args) {
		MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("applicationContext.xml");
//		AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext("pojo");
//		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));


		User user = (User) ac.getBean("user");
//		User user2 = (User) beanFactory.getBean("user");

//		Cat cat1 = ac1.getBean(Cat.class);
//		Cat cat2 =  ac1.getBean(Cat.class);
		System.out.println(user);
//		System.out.println(user2);
//		System.out.println(cat1 == cat2);
	}
}
