package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형 변수를 final로 선언
        //그렇기 때문에 추가 생성 불가능
        //data = new Data();
        //data라는 변수에 final을 건 것
        //data에 들어있는 참조값(X001)을 변경할 수 없는 것
        //다른 객체 참조 불가

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        //값 변경 가능
        // data(참조값)에 final이 걸린 것이고 data.value(객체, 값)는 변경 가능
    }
}
