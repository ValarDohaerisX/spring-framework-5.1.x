package context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lzx
 * @company 赞同科技
 * @date 2020/12/10 10:52
 * @Describetion
 */

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
		super(configLocation);
	}

	/**
	 * 重写Spring配置系统环境变量方法
	 */
	@Override
	protected void initPropertySources() {
		//"CLASSPATH",
		String[] systemProperties = new String[]{"CLASSPATH","JAVA_HOME","LOVE"};
		getEnvironment().setRequiredProperties(systemProperties);
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);

	}
}
