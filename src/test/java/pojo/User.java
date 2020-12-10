package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author lzx
 * @company 赞同科技
 * @date 2020/12/09 15:44
 * @Describetion
 */

@Component
public class User {
	@Value("user-1")
	private String name;
	@Value("24")
	private String age;
	@Autowired
	Cat cat;

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

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", cat=" + cat +
				'}';
	}
}
