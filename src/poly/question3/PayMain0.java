package poly.question3;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);
        System.out.println();

        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);
        System.out.println();

        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

    }
}
