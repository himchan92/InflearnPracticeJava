package Intro_Basic.construct.ex;

public class Book {
    String title;
    String author;
    int page;

    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = 1234;
    }

    public Book(String title, String author) {
        this("test", "tester", 100); //중복생성 방지위한 this 참조 생성자 오버로딩
    }

    public void displayInfo() {
        System.out.println("제목 : " + title + ", 작가 : " + author + ", 페이지: " + page);
    }
}
