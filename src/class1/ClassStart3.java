package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // Student = 객체를 생성하기 위한 클래스
        student1 = new Student(); // student1 = 객체(인스턴스), 실제 메모리에 올라감, 참조값 할당

        student1.name = "학생1"; // name = 속성(멤버변수)
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); // 패키지명.클래스명@참조값
        System.out.println(student2); // student2 = 참조값인 것!


        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

/*
student라는 타입을 직접 만든 것, 즉 설계도=클래스
클래스를 원하는 종류의 데이터 타입을 만드는 것
 */

    }
}
