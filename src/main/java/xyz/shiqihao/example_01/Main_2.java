package xyz.shiqihao.example_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext作为IoC容器
 */
public class Main_2 {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("fx.xml");
        FXNewsProvider newsProvider = (FXNewsProvider) container.getBean("djNewsProvider");
        newsProvider.getAndPersistNews();
    }
}
