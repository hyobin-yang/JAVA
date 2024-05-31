package extends1.overriding;

public class ElectricCar extends Car {

    @Override //애노테이션 => 근데 이거 없어도 잘 작동 but 보통 개발자들은 써놓음
    //써놓으면 move에 오타났을 때 부모클래스의 것이 실행되는 것이 아니라 컴파일 오류 뜸
    //오버라이딩을 제대로 안 하면 컴파일 오류를 낼 거야!! => 실수 방지
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다");
    } // 부모의 기능을 재정의 => 메서드 오버라이딩

    public void charge(){
        System.out.println("충전합니다.");
    }
}
