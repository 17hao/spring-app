package xyz.shiqihao.springinaction.soudsystem;

import org.springframework.stereotype.Component;

@Component
public class ConcreteCD implements CompactDisc {
    private final String title = "concrete cd";
    private final String artist = "sqh";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
