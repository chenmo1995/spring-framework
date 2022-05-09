package com.fudn.spring.beans;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author fdn
 * @since 2021-09-26 22:42
 */
@Data
@ToString
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//多次创建，返回不同的实例对象
public class Cat {
	public Cat(){
		System.out.println("cat创建");
	}
	private String Name;

	@Value("${JAVA_HOME}")
	public void setName(String name) {
		System.out.println("cat......setName()调用");
		Name = name;
	}
}
