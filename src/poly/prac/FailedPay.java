package poly.prac;

public class FailedPay implements Payment{
    @Override
    public boolean pay(){
        System.out.println("결제수단이 없습니다");
        return false;
    }
}
