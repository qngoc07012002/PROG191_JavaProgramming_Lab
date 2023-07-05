package EX5_6;

public class Restaurant extends Store{
    private int numberOfServed;
    private double averagePrice;
    public Restaurant(String name, int numberOfServed, double averagePrice) {
        super(name);
        this.numberOfServed = numberOfServed;
        this.averagePrice = averagePrice;
    }
    public double totalFax(){
        return (numberOfServed*averagePrice)*super.SALESJAXJATE;
    }

    @Override
    public String toString() {
        return "Restaurant{" +" name='"+super.getName()+", "+
                "numberOfServed=" + numberOfServed +
                ", averagePrice=" + averagePrice +
                ", totalFax=" + (float)totalFax() +
                '}';
    }
}
