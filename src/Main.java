

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("product1", 22.36 );
        Product product2 = new Product("product2", 10 );
        Product product3 = new Product("product3", 5.6 );
        //Product product4 = new Product("product4", 99.99 );

        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(product1);
        cart1.addProduct(product2);
        cart1.addProduct(product3);

        System.out.println(cart1.calculateTotalCost());

        cart1.removeProduct(product2);
        System.out.println(cart1.calculateTotalCost());

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.placeOrder(cart1);



    }
}