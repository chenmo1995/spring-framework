package com.fudn.spring.beans;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author fdn
 * @since 2021-09-26 18:34
 */
@Data
@ToString
@Component
public class Person {
	private String name;

//	@Autowired
	private Cat cat;

	public String getName() {
		return name;
	}

	@Lookup	//去容器中找		@Bean的注入方式注入Person，@Lookup不生效
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
