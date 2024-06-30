package poly.overriding2;

public class Child2 extends Parent{
    String name = "짱아";
    int siblingCnt = 2;
    int age = 1;

    @Override
    public void memberInfo(){
        System.out.println("Child.childMethod");
        System.out.println("부모님 성함 : " + super.name);
        System.out.println("내 이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("형제자매 수 : " + this.siblingCnt);

    }
}

