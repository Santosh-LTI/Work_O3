package springrestful_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "springrestful_example")
public class WebConfig {
	@Bean
	public CommonsMultipartResolver multipartResolver() {
CommonsMultipartResolver resolver= new CommonsMultipartResolver();
resolver.setMaxUploadSize(20971520);//20mb
resolver.setMaxInMemorySize(1048576);//1mb

return resolver;

	}

}
