package extends1.ex;

public class Album extends Item{

    String artist = "";

    public Album(String name, int price, String artist){
        super(name, price);
        this.artist = artist;

        print();
    }

    void print(){
        System.out.println("- 아티스트:"+ artist);
    }
}
