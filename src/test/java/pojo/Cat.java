package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.type.Scope;
import org.springframework.stereotype.Component;

/**
 * @author lzx
 * @company 赞同科技
 * @date 2020/12/09 17:54
 * @Describetion
 */
@Component
@Scope("prototype")
public class Cat {
	@Value("cat-1")
	private String name;
	@Value("3")
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
