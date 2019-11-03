package xyz.shiqihao.springinaction.knights;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
