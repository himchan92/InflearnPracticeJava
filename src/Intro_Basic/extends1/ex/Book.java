package Intro_Basic.extends1.ex;

public class Book extends Item {
    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price); //부모생성자 호출, 첫줄에 명시 필수
        this.author = author;
        this.isbn = isbn;
    }

    public void print() {
        System.out.println(super.name + ", " + super.price + ", " + author + ", " + isbn);
    }
}
