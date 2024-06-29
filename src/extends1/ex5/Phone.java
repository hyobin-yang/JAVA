package extends1.ex5;

public class Phone {
    String brand;
    String model;
    int year;
    int price;

    public void Print(){
        System.out.println("휴대폰 정보를 출력합니다.");
    }

    public void PhoneInfo(String brand, String model, int year, int price){
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Price : " + price + "원");
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}
