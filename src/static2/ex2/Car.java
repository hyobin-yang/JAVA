package static2.ex2;

public class Car {
    private String name;
    private static int carCnt = 0;

    Car(String name){
        System.out.println("차량 구입, 이름: " + name);
        carCnt ++;
        this.name = name;
    }

    static void showTotalCars(){
        System.out.println("구매한 차량 수: " + carCnt);
    }
}
