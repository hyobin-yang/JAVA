package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한 번만 할당 가능
        //data1 = 20; //컴파일 오류 뜸


        //final 지역 변수2
        final int data2 = 10; // 선언과 동시에 초기값 지정
    }

    static void method(final int parameter){
        //parameter = 20; // parameter의 값 바꾸지 못함, 처음 들어온 값으로 고정
    }

}
