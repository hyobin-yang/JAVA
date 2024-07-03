package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setCar(k3Car); // Car car = new K3Car(); 다형성
        driver.drive(); // 메서드는 오버라이딩된 것 출력

        System.out.println();

        // 차 변경
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        System.out.println();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();

    }
}
