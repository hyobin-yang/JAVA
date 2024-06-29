package extends1.ex4;

public class Movie extends Item{
    String director;
    String actor;

    public void MovieInfo(String director, String actor){
        System.out.println("감독 : " + director);
        System.out.println("배우 : " + actor);
        this.director = director;
        this.actor = actor;
    }
}
