package extends1.ex4;

public class ItemMain {
    public static void main(String[] args) {

        Book book = new Book();
        book.PrintInfo("우리들의 행복한 시간", 12000);
        book.BookInfo("공지영", "1234");
        System.out.println();

        Album album = new Album();
        album.PrintInfo("sector 17", 32000);
        album.AlbumInfo("세븐틴");
        System.out.println();

        Movie movie = new Movie();
        movie.PrintInfo("오펜하이머", 11000);
        movie.MovieInfo("크리스토퍼 놀란", "플로렌스 퓨");
        System.out.println();

        new Mystery(); // 기본 생성자 이용
        Book book2 = new Mystery(2); // 오버로딩 연습 - 랭킹 출력
        book2.PrintInfo("가면산장 살인사건", 9800);
        book2.BookInfo("히가시노 게이고", "4567");

    }
}
