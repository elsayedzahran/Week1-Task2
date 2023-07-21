

public class Product {
    private final String Name;
    private final double Price;

    public Product(String name, double price) {
        Name = name;
        Price = price;
    }
    public String getName() {
        return Name;
    }
    public double getPrice() {
        return Price;
    }

    public String toString(){
        return "ProductName = " + Name + "\nProductPrice = " + Price;
    }
}
