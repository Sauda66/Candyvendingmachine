package Vedingmachine;

public abstract class Products {
    private String name;
    private int price;

    public Products(String name,int price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public abstract String examine();
    public abstract Products request(int money);
    public abstract void use ();

}
