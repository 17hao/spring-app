package xyz.shiqihao.springinaction.soudsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
    @Bean
    public MediaPlayer player() {
        return new CDPlayer(cd());
    }

    @Bean
    CompactDisc cd() {
        return new ConcreteCD();
    }
}
