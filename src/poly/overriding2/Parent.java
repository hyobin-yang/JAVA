package poly.overriding2;

public class Parent {
    String name = "봉미선";
    boolean isMom = true;

    public void memberInfo(){
        System.out.println("Parent.parentMethod");
        System.out.println("부모님 성함 : " + name);
        System.out.println("어머니입니까 : " + isMom);
    }
}
