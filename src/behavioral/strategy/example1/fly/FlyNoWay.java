package behavioral.strategy.example1.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
