package extends1.ex5;

public class PhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone();
        smartPhone1.Print();
        smartPhone1.PhoneInfo("Samsung", "Galaxy S20", 2020, 1200000);
        smartPhone1.IsSmartPhone();
        smartPhone1.SmartPhoneInfo("iOS", 128);
        System.out.println("==========");

        SmartPhone smartPhone2 = new SmartPhone();
        smartPhone2.Print();
        smartPhone2.PhoneInfo("Apple", "Pro13", 2022, 1900000);
        smartPhone2.IsSmartPhone();
        smartPhone2.SmartPhoneInfo("iOS", 256);
        System.out.println("==========");

        SmartPhone smartPhone3 = new SmartPhone();
        smartPhone3.Print();
        smartPhone3.PhoneInfo("Nokia", "nokia17", 2016, 500000);
        smartPhone3.IsSmartPhone();
        smartPhone3.SmartPhoneInfo("IDK", 64);
        System.out.println("==========");

        BasicPhone basicPhone1 = new BasicPhone();
        basicPhone1.Print();
        basicPhone1.PhoneInfo("Nokia", "nokia16", 2013, 300000);
        basicPhone1.IsSmartPhone();
        basicPhone1.BasicPhoneInfo(true);

    }
}
