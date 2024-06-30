package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    // 다형적 참조 사용
    // 하나의 타입으로 통일한 것 -> 오버라이딩을 통해 각각의 메서드 출력 가능
    private static void soundAnimal(Animal animal){ // 부모는 자식을 담을 수 있다
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 오버라이딩된 메서드 있다면 하위 클래스의 메서드 출력
        System.out.println("동물 소리 테스트 종료");
    }
}
