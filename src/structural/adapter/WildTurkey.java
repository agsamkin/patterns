package structural.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void gobble() {
        System.out.println("gobble");
    }
}
