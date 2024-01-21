package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


        Student[] students = new Student[2];
        // 배열 생성하여 인스턴스 보관, students라는 배열에는 새로운 참조값 생성
        students[0] = student1;
        // student1의 참조값만 복사해서 students[0]에 전달
        // 즉 student1에 있는 참조값은 그대로 유지됨
        students[1] = student2;

        // 자바에서 대입은 항상 변수에 들어있는 값을 복사한다


        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

    }
}
