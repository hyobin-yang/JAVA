package static2;

import static static2.DecoData.staticCall; // 클래스명 안 적어도 생략 가능
import static static2.DecoData.staticCall2;
//import static static2.DecoData.*; // 모든 메서드 사용

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();


        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        // 여러번 호출할 때 -> import

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall2(data1);


    }
}
