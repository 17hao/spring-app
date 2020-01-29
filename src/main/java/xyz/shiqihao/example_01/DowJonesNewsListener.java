package xyz.shiqihao.example_01;

public class DowJonesNewsListener implements IFXNewsListener {
    @Override
    public void listen() {
        System.out.println("[DowJonesNewsListener] is listening...");
    }
}
