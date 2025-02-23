package Intro_Basic.class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview movieReview = new MovieReview();
        movieReview.title = "건담";
        movieReview.review = "로봇전투";
        movieReviews[0] = movieReview;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "좀비";
        movieReview2.review = "아포칼립스 전투";
        movieReviews[1] = movieReview2;

        System.out.println(movieReview.title + ", " + movieReview.review);
        System.out.println(movieReview2.title + ", " + movieReview2.review);

        for(MovieReview item : movieReviews) {
            System.out.println(item.title + ", " + item.review);
        }
    }
}
