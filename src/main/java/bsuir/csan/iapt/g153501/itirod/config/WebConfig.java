package bsuir.csan.iapt.g153501.itirod.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by alex on 11/26/14.
 */
@Configuration
@ComponentScan({"bsuir", "META-INF"})
@EnableWebMvc
public class WebConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resolver =  new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}