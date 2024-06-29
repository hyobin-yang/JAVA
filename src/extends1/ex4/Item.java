package extends1.ex4;

public class Item {

    String name;
    int price = 10000;

    public void PrintInfo(String name, int price){
        System.out.println("제목 : " + name);
        System.out.println("가격 : " + price);
        this.name = name;
        this.price = price;
    }
}
