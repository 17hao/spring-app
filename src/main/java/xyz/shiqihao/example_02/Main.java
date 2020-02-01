package xyz.shiqihao.example_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 记录一个一波三折写出来的AOP demo.
 *
 * 先记录一个坑, spring的xml文件中, 如果https开头的xsd链接可能会无法访问, 可以换成http.
 *
 * 理一下AOP(aspect oriented programming)相关的一些概念.
 *
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("example-02.xml");
        ITask task = (ITask) container.getBean("myTask");
        task.execute();
    }
}
