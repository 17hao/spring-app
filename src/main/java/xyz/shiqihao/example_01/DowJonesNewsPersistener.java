package xyz.shiqihao.example_01;

public class DowJonesNewsPersistener implements IFXNewsPersistener {
    @Override
    public void persist() {
        System.out.println("[DowJonesNewsPersistener] is persisting...");
    }
}
