package OOP_hm_inheritance.Money;

public class Money {
    int dollar;
    double cent;
    int euro;
    double euroCent;
    int rub;
    double rubCent;

    public Money(int dollar, double cent, int euro, double euroCent, int rub, double rubCent) {
        this.dollar = dollar;
        this.cent = cent;
        this.euro = euro;
        this.euroCent = euroCent;
        this.rub = rub;
        this.rubCent = rubCent;
    }

    public int getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    public double getCent() {
        return cent;
    }

    public void setCent(double cent) {
        this.cent = cent;
    }

    public int getEuro() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public double getEuroCent() {
        return euroCent;
    }

    public void setEuroCent(double euroCent) {
        this.euroCent = euroCent;
    }

    public int getRub() {
        return rub;
    }

    public void setRub(int rub) {
        this.rub = rub;
    }

    public double getRubCent() {
        return rubCent;
    }

    public void setRubCent(double rubCent) {
        this.rubCent = rubCent;
    }

    public void addMoney(Money money){
        dollar += money.dollar;
        cent += money.cent;
        euro += money.euro;
        euroCent += money.euroCent;
        rub+=money.rub;
        rubCent+=money.rubCent;
    }

    public void subtractMoney(Money money){
        dollar -= money.dollar;
        cent -= money.cent;
        euro -= money.euro;
        euroCent -= money.euroCent;
        rub -= money.rub;
        rubCent -= money.rubCent;
    }
    public void displayAmount() {
        System.out.println(dollar + "$ "+ cent +" cent \n"
                + euro + "€ " + euroCent+" euroCent \n"
                + rub + "₽ " + rubCent + " rubCent" );
    }
    public class Product{
        String nameProduct;
        Money price;
        public Product(String nameProduct, Money price) {
            this.nameProduct = nameProduct;
            this.price = price;
        }

        public void displayProduct() {
            System.out.println("Product: " + nameProduct);
            price.displayAmount();
        }

        public void reducePrice(Money amount) {
            price.subtractMoney(amount);
        }
    }
}
