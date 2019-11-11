package xyz.shiqihao.springinaction.soudsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    void play() {
        cd.play();
    }
}
