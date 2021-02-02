package Vedingmachine;

import java.awt.datatransfer.StringSelection;
import java.util.Objects;

public class Candy extends products {

    private int sugarPercent;

    public void Candy(String name, int price, int sugarPercent){
        super(name, price);
        this.sugarPercent=sugarPercent;
    }

    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return sugarPercent == candy.sugarPercent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sugarPercent);
    }

    public string examine(){
        return " The snack you're looking at is:" +
                getName() +
                "it contains:" + sugarPercent +"% suger"
        "its price is:" + getPrice();
    }
    @Override
    public Candy purchse(int money){

        if (money >= getprice()){
            return this;
            return null;
            String[] price={"1Kr","2Kr","5kr","10kr","20kr","50kr","100kr","200kr","500kr","1000kr"};
            System.out.println(price[1-1000]);
            //outputs from 1kr to 1000kr
        }
        @Override
                public void use(){
            System.out.println("you can pay 2 for 3" getName() +
                    "Have a good enjoyment!");
        }
    }


    public StringSelection getPrice() {
        return price;
    }

    public void setPrice(StringSelection price) {
        this.price = price;
    }
}
