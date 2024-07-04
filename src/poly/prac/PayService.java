package poly.prac;

public class PayService {

    public void processPay(String option, int amount){
        System.out.println("결제를 시작합니다: option= " + option + ", amount= " + amount);

       Payment payment = PayStore.findPay(option);

        if (payment.pay()){
            System.out.println(amount + "원 결제를 시도합니다.");
            System.out.println("결제가 성공했습니다.");
        } else{
            System.out.println("결제가 실패했습니다.");
        }
    }
}

