package poly.ex2;

public class Cow extends Animal{

    @Override // ^O -> 오버라이딩 단축키
    public void sound() {
        System.out.println("음매");
    }
}
