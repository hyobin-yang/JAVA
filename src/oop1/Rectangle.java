package oop1;

// 객체지향으로 만들기
public class Rectangle {
    int width = 5;
    int height = 8;


    void calculateArea(){
        System.out.println("넓이: " + (width*height));
    }

    void calculatePerimeter(){
        System.out.println("둘레 길이: " + ((2*width) + (2*height)));
    }

    void isSquare(){
        System.out.println("정사각형 여부 " + (width == height));
    }


}
