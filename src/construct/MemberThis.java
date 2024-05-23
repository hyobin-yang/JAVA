package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; // nameField 앞에 this 생략(같은 이름이 아니므로)
    }
}
