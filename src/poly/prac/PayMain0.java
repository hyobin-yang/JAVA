package poly.prac;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao
        String payOption1 = "kakao";
        int amount1 = 10000;
        payService.processPay(payOption1, amount1);

        //naver
        String payOption2 = "naver";
        int amount2 = 5000;
        payService.processPay(payOption2, amount2);

        //fail
        String payOption3 = "bad";
        int amount3 = 8000;
        payService.processPay(payOption3, amount3);
    }
}
