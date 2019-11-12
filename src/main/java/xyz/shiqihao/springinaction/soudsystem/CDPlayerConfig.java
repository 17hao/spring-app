package xyz.shiqihao.springinaction.soudsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
    @Bean
    MediaPlayer plainPlayer() {
        return new CDPlayer(cd());
    }

    @Bean
    MediaPlayer sonyPlayer() {
        return new SonyCDPlayer(cd());
    }

    private CompactDisc cd() {
        return new ConcreteCD();
    }
}
