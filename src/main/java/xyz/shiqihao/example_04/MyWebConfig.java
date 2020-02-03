package xyz.shiqihao.example_04;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("xyz.shiqihao.example_04")
public class MyWebConfig implements WebMvcConfigurer {
}
