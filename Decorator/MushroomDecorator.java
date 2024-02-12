public class MushroomDecorator implements Pizza
{
    protected Pizza pizza;
    
    public MushroomDecorator(Pizza pizza)
    {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", mushrooms";
    }
    
    @Override
    public double getCost()
    {
        return pizza.getCost() + 1.25;
    }
}
