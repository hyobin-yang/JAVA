package poly.prac;

public class KakaoPay implements Payment{

    @Override
    public boolean pay(){
        System.out.println("카카오페이 시스템과 연결합니다.");
        return true;
    }
}
