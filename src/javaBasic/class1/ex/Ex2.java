package javaBasic.class1.ex;

class ProductOrder {
    String name;
    int price;
    int quantity;
}

public class Ex2 {
    public static void main(String[] args) {
        ProductOrder p = new ProductOrder();
        p.name = "일식";
        p.price = 1200;
        p.quantity = 1;
        ProductOrder p2 = new ProductOrder();
        p2.name = "중식";
        p2.price = 2400;
        p2.quantity = 5;
        ProductOrder p3 = new ProductOrder();
        p3.name = "한식";
        p3.price = 3600;
        p3.quantity = 10;

        ProductOrder[] productOrders = {p, p2, p3};

        for(ProductOrder item : productOrders) {
            System.out.println(item.name + ", " + item.price + ", " + item.quantity);
        }
    }
}
