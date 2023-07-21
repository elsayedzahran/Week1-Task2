
public class OrderProcessor {
    public void placeOrder(ShoppingCart cart){
        System.out.printf("Order Data");
        for (Product product : cart.getProducts()){
            System.out.println(product);
            System.out.println("----------------------------");
        }
        System.out.println("Total Cost = " + cart.calculateTotalCost());
        System.out.println("//////////////////////////////////////");
    }
}
