package br.com.devops.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class SpringMVCServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses complete!");
		return new Class[] { WebAppConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses complete!");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings complete!");
		return new String[]{"/"};
	}
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("onStartup complete!");
		super.onStartup(servletContext);
	}
	
}
