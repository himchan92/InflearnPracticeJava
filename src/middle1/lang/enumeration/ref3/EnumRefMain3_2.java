package middle1.lang.enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        //출력문 간결화 리팩토링
        //values() 이용해서 모든요소 가져오기 가능
        Grade[] grades = Grade.values();
        for(Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}