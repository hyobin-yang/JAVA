package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value); //현재 내 타입에서 찾기, this는 생략 가능
        System.out.println("super value = " + super.value); //부모 타입에서 찾기

        this.hello();
        super.hello();
    }
}
