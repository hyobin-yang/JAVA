package oop1;

// 절차지향코드
public class RectangleOopMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        int perimeter = calculatePerimeter(width, height);
        boolean isSquare = isSquare(width, height);

        System.out.println("넓이: " + area);
        System.out.println("둘레 길이: " + perimeter);
        System.out.println("정사각형 여부: " + isSquare);


    }


    static int calculateArea(int width, int height){
        int area = width * height;
        return area;
    }

    static int calculatePerimeter(int width, int height){
        int perimeter = (2*width) + (2*height);
        return perimeter;
    }

    static boolean isSquare(int width, int height){
        return width == height;
    }
}
