package behavioral.template_method.beverage;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dropping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
