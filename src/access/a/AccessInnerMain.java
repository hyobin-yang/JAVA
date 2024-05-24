package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출
        data.defaultField = 2;
        data.defaultMethod();

        // private은 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess(); // 내부에서는 모든 필드에 접근할 수 있으므로 실행 가능
    }
}
