package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전 dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 dataA.value = " + dataA.value); // 값 변함, 참조형 변수는 참조값이 복사되기 때문
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }

}
