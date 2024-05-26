package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // 인스턴스 생성하지 않고 바로 부르기(정적 메서드)

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
