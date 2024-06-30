package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        //Animal[] animalArr = new Animal[]{dog, cat, cow}; -> 아래 축약형으로 사용 가능
        Animal[] animalArr = {dog, cat, cow};

        //변하지 않는 부분
        for (Animal animal : animalArr) { // 단축키: iter 엔터
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }


}
