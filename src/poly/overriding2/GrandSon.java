package poly.overriding2;

public class GrandSon extends Child1{
    String name = "없음";

    @Override
    public void memberInfo(){
        System.out.println("손자 없음");
    }
}
