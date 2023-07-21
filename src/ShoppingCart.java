import java.util.ArrayList;


public class ShoppingCart {
    private ArrayList<Product> Products;
    public ShoppingCart() {
        Products = new ArrayList<>();
    }
    public ShoppingCart(int Size) {
        Products = new ArrayList<>(Size);
    }
    public void addProduct(Product product){
        Products.add(product);
    }
    public void removeProduct(Product product) {
        Products.remove(product);
    }
    public double calculateTotalCost(){
        double Cost = 0;
        for (Product product : Products){
            Cost += product.getPrice();
        }
        return Cost;
    }
    public ArrayList<Product> getProducts(){
        return Products;
    }

}
