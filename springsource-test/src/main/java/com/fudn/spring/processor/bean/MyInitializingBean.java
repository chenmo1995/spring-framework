package com.fudn.spring.processor.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 生命周期接口
 *
 * @author fdn
 * @since 2021-09-28 23:36
 */
//@Component
public class MyInitializingBean implements InitializingBean {
	public MyInitializingBean(){
		System.out.println("自定义MyInitializingBean无参构造方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyInitializingBean......afterPropertiesSet");
	}
}
