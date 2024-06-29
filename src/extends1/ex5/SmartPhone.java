package extends1.ex5;

import java.util.Objects;

public class SmartPhone extends Phone{
    String operatingSystem = "Android";
    int storageCapacity;

    public void IsSmartPhone(){
        System.out.println("이 기종은 스마트폰입니다");
    }

    // 조건문 추가해보기
    public void SmartPhoneInfo(String operatingSystem, int storageCapacity){
        if (Objects.equals(super.brand, "Samsung")){
            System.out.println("Operating System : " + this.operatingSystem);
        } else if (Objects.equals(super.brand, "Apple")){
            System.out.println("Operating System : " + "iOS");
        } else{
            System.out.println("Operating System : " + operatingSystem);
        }
        this.storageCapacity = storageCapacity;
        System.out.println("Storage Capacity : " + storageCapacity + "GB");
    }
}

// 참조형 변수 비교할 때 => Objects.equals(비교대상1, 비교대상2) => boolean 값