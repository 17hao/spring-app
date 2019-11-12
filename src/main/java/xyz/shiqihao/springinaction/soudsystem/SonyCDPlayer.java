package xyz.shiqihao.springinaction.soudsystem;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
class SonyCDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Inject
    SonyCDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    void play() {
        cd.play();
    }
}
