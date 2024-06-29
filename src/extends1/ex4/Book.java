package extends1.ex4;

public class Book extends Item{

    String author;
    String isbn;

    @Override
    public void PrintInfo(String name, int price){
        System.out.println("제목은요 : " + name);
        this.name = name;
        System.out.println("가격 : " + super.price); // 부모 클래스의 price 변수 출력(super)
    }

    public void BookInfo(String author, String isbn){
        System.out.println("저자 : " + author);
        System.out.println("isbn : " + isbn);
        this.author = author;
        this.isbn = isbn;
    }
}
