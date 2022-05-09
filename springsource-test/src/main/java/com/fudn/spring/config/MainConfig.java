package com.fudn.spring.config;

import com.fudn.spring.beans.Cat;
import com.fudn.spring.beans.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author fdn
 * @since 2021-09-26 22:21
 */
//@Import({MainConfig.MyImportRegistrar.class})
@Configuration
@ComponentScan("com.fudn.spring")
public class MainConfig {
	public MainConfig(){
		System.out.println("MainConfig...创建");
	}

//	@Bean
//	public Person person() {
//		Person person = new Person();
//		person.setName("李四");
//		return person;
//	}

//	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar{
//		/**
//		 * BeanDefinitionRegistry:bean定义信息的注册中心
//		 * 						它里面都是BeanDefinition
//		 *
//		 * Register bean definitions as necessary based on the given annotation metadata of
//		 * the importing {@code @Configuration} class.
//		 * <p>Note that {@link BeanDefinitionRegistryPostProcessor} types may <em>not</em> be
//		 * registered here, due to lifecycle constraints related to {@code @Configuration}
//		 * class processing.
//		 * <p>The default implementation is empty.
//		 *
//		 * @param importingClassMetadata annotation metadata of the importing class
//		 * @param registry               current bean definition registry
//		 */
//		@Override
//		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//			//BeanDefinition
//			RootBeanDefinition catDefinition = new RootBeanDefinition();
//			//至少得有类型class		名字name
//			catDefinition.setBeanClass(Cat.class);
//			registry.registerBeanDefinition("tomcat",catDefinition);
//		}
//	}
}

