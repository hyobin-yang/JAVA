package access.b;

import access.a.PublicClass;
// import access.a.DefaultClass1; // 이것도 오류 => 다른 패키지 소속이고 public 클래스도 아니므로
public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicclass = new PublicClass(); // public 클래스이므로 어디서든지 호출가능

        // 다른 패키지의 클래스로는 접근 불가(access.a 소속 default 클래스이므로)
        // DefaultClass1 class1 = new Defaultclass1();
    }
}
