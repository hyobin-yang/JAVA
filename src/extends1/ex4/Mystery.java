package extends1.ex4;

public class Mystery extends Book{
    String genre = "mystery";
    int rank;

    // 기본 생성자 수정
    Mystery(){
        System.out.println("장르까지 출력해보자!!");
    }

    //오버로딩 연습
    Mystery(int rank){
        System.out.println("랭킹 : " + rank);
    }

    @Override
    public void PrintInfo(String name, int price){
        System.out.println("제목 : " + name);
        System.out.println("장르 : " + genre);
        System.out.println("가격 : " + price);
    }
}
