package class1;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder p1 = new ProductOrder();
        p1.productname = "두부";
        p1.price = 2000;
        p1.quantity = 2;
        productOrders[0] = p1;

        ProductOrder p2 = new ProductOrder();
        p2.productname = " 김치";
        p2.price = 5000;
        p2.quantity = 1;
        productOrders[1] = p2;

        ProductOrder p3 = new ProductOrder();
        p3.productname = " 콜라";
        p3.price = 1500;
        p3.quantity = 2;
        productOrders[2] = p3;


        int total = 0;
        for (ProductOrder p : productOrders){
            total += p.price * p.quantity;
            System.out.println("상품명: " + p.productname + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }

        System.out.println("총 결제 금액: " + total);


    }
}
