package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        //선언한 변수 제거하고 합치는 단축키: opt + cmd + N

        for (Animal animal : animalArr) { // 단축키: iter 엔터
            soundAnimal(animal); // 단축키 : opt + cmd + M
        }

    }

    //새로운 동물이 생성되어도 변하지 않는 부분
    //새로운 기능이 추가되었을 때 변하는 부분을 최소화하는 코드가 클린 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
