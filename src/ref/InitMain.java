package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // 0으로 초기화됨을 알 수 있음
        System.out.println("value1 = " + data.value2);

    }
}
