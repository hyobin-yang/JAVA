package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User user = new pack.a.User(); // 다른 패키지의 클래스 불러올 때 패키지명 적어주기
    }
}
