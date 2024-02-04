package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data); // 선언 안 해줬으니 null

        // nullPointerException 터짐
        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
