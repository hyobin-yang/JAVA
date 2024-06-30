package poly.ex3;

public abstract class AbstractAnimal { // 클래스 자체도 추상클래스로 선언해야 함

    //추상메서드 -> 호출 불가 -> 메서드 바디{} 존재하지 않음
    //자식이 반드시 오버라이딩 해야함
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
