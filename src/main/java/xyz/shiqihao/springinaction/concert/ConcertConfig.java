package xyz.shiqihao.springinaction.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
class ConcertConfig {

    @Bean
    Audience audience() {
        return new Audience();
    }
}
