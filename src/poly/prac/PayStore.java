package poly.prac;

public abstract class PayStore {

    public static Payment findPay(String option){
        if (option.equals("kakao")){
            return new KakaoPay();
        } else if (option.equals("naver")){
            return new NaverPay();
        } else {
            return new FailedPay();
        }
    }
}
