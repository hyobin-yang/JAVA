package poly.basic2;

public class PolyMain {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.parentMethod();
        call(parent);
        System.out.println();

        Child child = new Child();
        child.childMethod();
        System.out.println();

        Parent poly = new Child();
        poly.parentMethod();
        //poly.childMethod(); => 자식 메서드 호출 불가
        call(poly);
        System.out.println();

        Child poly2 = (Child) poly; // 다운캐스팅 -> 자식 메서드 호출
        poly2.childMethod();
        poly2.parentMethod();
        System.out.println();

        ((Child)poly).childMethod(); // 일시적 다운캐스팅 -> 변수에 담지 않음
        System.out.println();

        Parent parent2 = child; // 업캐스팅
        parent2.parentMethod();
        call(parent2);
        System.out.println();

        // instanceof 확인
        System.out.println("parent instanceof Parent : " + (parent instanceof Parent)); // t
        System.out.println("parent instanceof Child : " + (parent instanceof Child)); // f
        System.out.println("child instanceof Child : " + (child instanceof Child)); // t
        System.out.println("child instanceof Parent : " + (child instanceof Parent)); // t
        System.out.println("poly instanceof Child : " + (poly instanceof Child)); //t
        System.out.println("poly instanceof Parent : " + (poly instanceof Parent)); // t
        System.out.println("poly2 instanceof Child : " + (poly2 instanceof Child)); // t
        System.out.println("poly2 instanceof Parent : " + (poly2 instanceof Parent)); // t

        System.out.println();

        call2(parent); // 참조 X
        System.out.println();
        call2(poly); // 참조 O
        System.out.println();
        call2(poly2); // 참조 O

    }

    private static void call(Parent parent){
        parent.parentMethod();
        if (parent instanceof Child){
            System.out.println("이 변수는 Child 인스턴스를 참조합니다");
            Child child = (Child) parent;
            child.childMethod();
        } else{
            System.out.println("이 변수는 Child 인스턴스를 참조하지 않습니다");
        }
    }

    private static void call2(Parent parent){
        if (parent instanceof Child child){
            System.out.println("Child 인스턴스가 맞으므로 Child 변수를 선언합니다");
            child.childMethod();
            child.parentMethod();
        } else{
            System.out.println("이 변수는 Child 인스턴스를 찹조하지 않습니다");
        }
    }


}
