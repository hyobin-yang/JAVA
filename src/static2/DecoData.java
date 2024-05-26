package static2;

public class DecoData {

    private int instanceValue; // 인스턴스 변수
    private static int staticValue; // 메모리 바로 할당(메서드 영역에 할당)

    public static void staticCall(){ // JVM에 바로 생성, 바로 메모리 할당

        //instanceValue ++; // 인스턴스 변수에 접근, compile error
        //instanceMethod(); // 인스턴스 메서드에 접근, compile error
        // 인스턴스 변수는 main에서 생성이 되어야 생성되므로
        // static은 static만 접근 가능

        staticValue ++; // 정적변수에 접근
        staticMethod(); // 정적메서드에 접근


        // static만 사용 가능
    }

    public void instanceCall(){ // static 메서드 아님, 인스턴스 생성 시 메모리 올라감
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue= " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }


    public static void staticCall2(DecoData data){ // 내부에서 참조하는 것이 아니므로

        data.instanceValue ++; // 참조값이 있으니 이제 호출 가능
        data.instanceMethod(); //


        staticValue ++; // 정적변수에 접근
        staticMethod(); // 정적메서드에 접근


        // static만 사용 가능
    }
}
