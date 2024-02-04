package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 이제 선언해줬으니 에러 안 뜰 것
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // nullPointerException 터짐
        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
