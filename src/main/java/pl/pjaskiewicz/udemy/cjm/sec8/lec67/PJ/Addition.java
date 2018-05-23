package pl.pjaskiewicz.udemy.cjm.sec8.lec67.PJ;

public class Addition {
    private String name;
    private double price;
    private int quantity;

    public Addition(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String printNameIfQuantityPositive(){
        if (this.quantity > 0){
            return this.quantity + " x " + this.name + ", ";
        }else
            return "";
    }

    public double additionPrice(){
        return price * quantity;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
