package poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine"); //soutm: 단축키
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
