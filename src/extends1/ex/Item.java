package extends1.ex;

public class Item {

    String name="";
    int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("이름:" + name + ", 가격:" + price);
    }

    int getPrice(){
        return this.price;
    }


}
