package xyz.shiqihao.springinaction.knights;

import java.io.PrintStream;

public class SavePrincessQuest implements Quest {
    private PrintStream stream;

    SavePrincessQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.print("Success!");
    }
}
