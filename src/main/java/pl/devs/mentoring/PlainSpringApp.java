package pl.devs.mentoring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@EnableWebMvc
@ComponentScan("pl.devs.mentoring")
public class PlainSpringApp extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{PlainSpringApp.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[0];
	}

}
