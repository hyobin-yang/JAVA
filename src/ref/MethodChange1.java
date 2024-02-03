package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 a = " + a); // 값 변하지 않음, 기본형 변수는 값만 그대로 복사되기 때문
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
