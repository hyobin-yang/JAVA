package class1;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간영화";

        MovieReview[] movieReviews = {inception, aboutTime};


        //방법 1
//        for (int i = 0; i < movieReviews.length; i++){
//            MovieReview m = movieReviews[i];
//
//            System.out.println("제목: " + m.title + " 내용: " + m.review);
//        }

        //방법 2
        for (MovieReview m : movieReviews){
            System.out.println("제목: " + m.title + " 내용: " + m.review);
        }





    }

}
