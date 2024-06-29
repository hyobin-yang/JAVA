package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        System.out.println("parent2 호출");
        Parent parent2 = new Child();
        call(parent2);
    }

    public static void call(Parent parent){
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child){ // 인스턴스 맞으면 바로 다운캐스팅 가능(직접 다운캐스팅 생략 가능)
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }

    }
}
