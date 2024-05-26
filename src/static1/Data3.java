package static1;

public class Data3 {
    public String name;
    public static int count;

    public Data3(String name){
        this.name = name;
        count++; // 자신의 클래스 내에 있는 정적 변수는 클래스명 생략 가능(Data3. 생략)
    }
}
