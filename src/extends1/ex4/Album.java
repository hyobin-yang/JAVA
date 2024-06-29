package extends1.ex4;

public class Album extends Item{
    String artist;

    public void AlbumInfo(String artist){
        System.out.println("아티스트 : " + artist);
        this.artist = artist;
    }
}
