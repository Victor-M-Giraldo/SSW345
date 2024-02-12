public class PepperoniDecorator implements Pizza
{
    protected Pizza pizza;
    
    public PepperoniDecorator(Pizza pizza)
    {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", pepperoni";
    }
    
    @Override
    public double getCost()
    {
        return pizza.getCost() + 1.5;
    }
}
