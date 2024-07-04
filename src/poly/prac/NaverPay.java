package poly.prac;

public class NaverPay implements Payment{

    @Override
    public boolean pay(){
        System.out.println("네이버페이 시스템과 연결합니다.");
        return true;
    }
}
