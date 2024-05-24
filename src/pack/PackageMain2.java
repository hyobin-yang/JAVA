package pack; // 첫줄

//import pack.a.User;
//import pack.a.User2;

import pack.a.*; // pack.a 안에 있는 모든 클래스 한번에 import
public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // 패키지 import 했으니 클래스명만 적어도 됨
        User2 user2 = new User2();
    }
}
