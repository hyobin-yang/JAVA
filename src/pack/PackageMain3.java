package pack;


import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); //이름 같을 경우에 하나는 경로 다 적어줘야 함
    }
}
