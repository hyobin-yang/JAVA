package ref;


public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        getTotalAmount(orders);

        // int totalAmount = getTotalAmoutn(orders);
        // 칠 때 단축키 Ctrl+Alt+V 하면 totalAmount라는 변수값 알아서 자동으로 생성해줌

    }

    static ProductOrder createOrder(String productName, int price, int quantity){

        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;

    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }

    }

    static void getTotalAmount(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder order : orders){
            total += (order.price * order.quantity);
        }
        System.out.println("총 결제 금액: " + total);

    }

}
