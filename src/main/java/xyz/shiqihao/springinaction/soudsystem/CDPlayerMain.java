package xyz.shiqihao.springinaction.soudsystem;

public class CDPlayerMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ((CDPlayer) CDPlayerConfig.class.newInstance().plainPlayer()).play();
        ((SonyCDPlayer) CDPlayerConfig.class.newInstance().sonyPlayer()).play();
    }
}
