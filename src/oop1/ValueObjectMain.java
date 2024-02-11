package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add(); // valueData 클래스에 있는 메서드를 사용
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자=" + valueData.value);

    }

}
