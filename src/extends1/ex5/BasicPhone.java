package extends1.ex5;

public class BasicPhone extends Phone{
    boolean hasPhysicalKeyboard;

    public void IsSmartPhone(){
        System.out.println("이 기종은 스마트폰이 아닙니다.");
    }

    public void BasicPhoneInfo(boolean hasPhysicalKeyboard){
        this.hasPhysicalKeyboard = hasPhysicalKeyboard;
        checkKeyboard();
    }

    void checkKeyboard(){
        if (hasPhysicalKeyboard){
            System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
        } else{
            System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
        }
    }
}
