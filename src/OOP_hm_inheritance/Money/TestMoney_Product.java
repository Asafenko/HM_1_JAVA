package OOP_hm_inheritance.Money;

public class TestMoney_Product {
    public static void main(String[] args) {
        Money money1 = new Money(90,0.85,45,0.66d,4000,0.90);
        Money.Product product1 = money1.new Product("Example Product", money1);

        System.out.println("------------------------------");

        money1.displayAmount();

        System.out.println("------------------------------");

        product1.displayProduct();

        Money discount = new Money(20,0.30,15,0.40,2300,0.45);

        product1.reducePrice(discount);

        System.out.println("------------------------------");

        product1.displayProduct();

    }
}
