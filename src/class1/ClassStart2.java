package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80}; // 인덱스 맞추기

        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);

        }
    }
}
/*
배열 선언 -> for문 이용해서 한 번에 출력
추가하고자 하는 값이 있으면 배열에 추가
but 한 명의 학생에 대해 항목마다 배열이 나누어져 있음 -> 인덱스 실수하면 안 됨
-> 사람이 관리하기에 좋은 방식 아님, 특정 학생을 묶는 게 편함
-> 클래스로 학생이라는 개념을 만들자!
 */