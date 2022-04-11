package com.mvc.JavaConfig.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan("com.mvc.JavaConfig")
public class ServletContext implements WebMvcConfigurer {
	
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver(); 
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
