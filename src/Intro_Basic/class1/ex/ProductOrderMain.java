package Intro_Basic.class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = "두부";
        productOrder.price = 2000;
        productOrder.quantity = 2;
        productOrders[0] = productOrder;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        productOrders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
        productOrders[2] = productOrder3;

        int sum = 0;
        for(ProductOrder item : productOrders) {
            sum += (item.price * item.quantity);
            System.out.println("상품명: " + item.productName + ", 가격: " + item.price + ", 수량: " + item.quantity);
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
