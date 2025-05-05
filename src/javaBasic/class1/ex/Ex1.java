package javaBasic.class1.ex;

class MovieReview {
    String title;
    String review;
}

public class Ex1 {

    public static void main(String[] args) {
        MovieReview movieReview = new MovieReview();
        movieReview.title = "미션임파서블";
        movieReview.review = "마지막 영화..ㅠㅠ";

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "어벤져스 둠스데이";
        movieReview1.review = "과연 흥할까..";

        MovieReview[] movieReviews = {movieReview, movieReview1};

        for(MovieReview m : movieReviews) {
            System.out.println(m.title + ", " + m.review);
        }
    }
}
