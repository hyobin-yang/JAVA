package final1;

import static1.Counter;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        //상수 사용하면 MAX_USERS만 수정하면 됨
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS){ // 변수 의미 더 명시적
            System.out.println("대기자로 등록합니다");
        } else{
            System.out.println("게임에 참여합니다");
        }
    }
}
