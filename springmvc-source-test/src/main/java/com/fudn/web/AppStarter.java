package com.fudn.web;

import com.fudn.web.config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 只要实现了 WebApplicationInitializer 接口，相当于配置了 SpringMVC 的DispatchServlet
 * 1、Tomcat一启动就加载这个文件
 * 			创建了容器、指定了配置类 所有的IOC、AOP等Spring的功能就有了
 * 			注册一个Servlet DispatchServlet；
 * 			以后所有的请求都交给了我 DispatchServlet
 * 		效果，访问Tomcat部署的这个web应用下的所有请求都会被 DispatchServlet 处理
 * 		DispatchServlet 就会进入强大的基于注解的mvc处理流程(@GetMapping)
 *
 * 	servlet3.0以上 需要tomcat6.0以上才能支持，不包括6.0
 *
 * 	servlet shi javaEE的web的规范标准，tomcat是Servlet 规范的实现
 *
 * @author fdn
 * @since 2021-10-11 22:36
 */
public class AppStarter implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		// Load Spring web application configuration	自己创建一个IOC容器
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		//注册主配置类
		context.register(AppConfig.class);
		//IOC容器这时候还没有
		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");

		/**
		 * DispatcherServlet 放到 servletContext 容器中，Tomcat就会对servlet进行初始化
		 */


	}
}



















