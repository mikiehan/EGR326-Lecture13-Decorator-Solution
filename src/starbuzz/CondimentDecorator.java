package starbuzz;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    @Override
    public abstract String getDescription();
}
