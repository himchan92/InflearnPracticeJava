package extends1.ex;

public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("Java", 1000, "han", "12345");
        book.print();

        int sum = book.getPrice();
        System.out.println("총합 : " + sum);
    }
}
