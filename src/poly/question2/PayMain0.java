package poly.question2;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        Scanner sc = new Scanner(System.in);

        while(true){
            String payOption = sc.next();
            if (payOption.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            int amount = sc.nextInt();
            payService.processPay(payOption, amount);
            System.out.println();
        }


    }
}
