package ref;
import java.util.Scanner;

public class ProductOrderMainPrac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int num = sc.nextInt();

        ProductOrderPrac[] orders = new ProductOrderPrac[num];

        for (int i=0; i<num; i++) {
            System.out.println(i+1 + "번째 주문 정보를 입력하세요.");
            System.out.println("상품명: ");
            String productName = sc.next();
            System.out.println("가격: ");
            int price = sc.nextInt();
            System.out.println("수량: ");
            int quantity = sc.nextInt();

            orders[i] = createOrder(productName, price, quantity);

        }

        printOrders(orders);
        int totalPrice = totalPrice(orders);
        System.out.println("총 결제 금액: " + totalPrice);

    }

    static ProductOrderPrac createOrder(String productName, int price, int quantity){
        ProductOrderPrac order = new ProductOrderPrac();
        order.price = price;
        order.productName = productName;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrderPrac[] orders){
        for (ProductOrderPrac order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price+", 수량: " + order.quantity);
        }
    }

    static int totalPrice(ProductOrderPrac[] orders){
        int total = 0;
        for (ProductOrderPrac order : orders){
            total += (order.quantity * order.price);
        }
        return total;
    }

}
