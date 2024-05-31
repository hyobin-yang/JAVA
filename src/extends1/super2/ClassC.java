package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        super(10, 20); // ClassB에 기본 생성자가 없기 때문에 매개변수 필요
        System.out.println("ClassC 생성자");
    }
}
