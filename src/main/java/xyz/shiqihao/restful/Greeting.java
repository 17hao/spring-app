package xyz.shiqihao.restful;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    long id() {
        return id;
    }

    String content() {
        return content;
    }
}
