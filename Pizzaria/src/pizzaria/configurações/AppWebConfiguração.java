package pizzaria.configura��es;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import pizzaria.controles.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class})
public class AppWebConfigura��o {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/Pizzaria/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
