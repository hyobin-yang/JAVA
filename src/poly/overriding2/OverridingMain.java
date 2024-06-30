package poly.overriding2;

public class OverridingMain {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        parent1.memberInfo();
        System.out.println(parent1.name);
        System.out.println();

        Child1 child1 = new Child1();
        child1.memberInfo();
        System.out.println(child1.name);
        System.out.println();

        Child2 child2 = new Child2();
        child2.memberInfo();
        System.out.println(child2.name);
        System.out.println();

        GrandSon grandSon1 = new GrandSon();
        grandSon1.memberInfo();
        System.out.println();

        Parent parent2 = new Child1();
        parent2.memberInfo(); //parent 클래스의 메서드 출력
        //parent2.printInfo();
        System.out.println();

        Child1 child3 = new GrandSon();
        child3.memberInfo(); // child1 클래스의 메서드 출력
        System.out.println();

        System.out.println("일시적 다운캐스팅");
        ((Child1)parent2).printInfo(); // Child1 메서드 출력 가능
        ((Child1)parent2).memberInfo(); // Child1 클래스의 메서드 출력
        System.out.println();

        // 오버라이딩 => 변수는 오버라이딩 X, 메서드는 오버라이딩!!
        System.out.println(parent2.name); // 봉미선
        parent2.memberInfo(); // 메서드는 짱구 메서드
        System.out.println();

        System.out.println("parent -> grandson");
        Parent poly = new GrandSon();
        System.out.println(poly.name); // 봉미선
        poly.memberInfo();
        System.out.println();

        // 다운캐스팅
        Child1 child4 = (Child1)parent2;
        System.out.println(child4.name);
        System.out.println();

        // 메서드 오버라이딩 호출
        Parent poly2 = new GrandSon();
        System.out.println(poly2.name);
        poly2.memberInfo(); // 최하위 자식의 오버라이딩 메서드가 우선권 가짐


        // 이중 다운캐스팅은 불가
//        System.out.println("Child -> Grandson");
//        GrandSon grandSon3 = (GrandSon) child4;
//        System.out.println(grandSon3.name);
//        grandSon3.memberInfo();



    }
}
