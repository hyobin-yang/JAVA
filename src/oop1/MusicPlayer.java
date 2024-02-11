package oop1;

// 음악 플레이어를 재생하기 위한 데이터와 기능 한 클래스 내에 모두 포함
public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;
    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨:" +volume);
    }

    void playerStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if (isOn){
            System.out.println("음악 플레이어 ON, 볼륨: "+ volume);
        } else{
            System.out.println("음악 플레이어 OFF, 볼륨: " + volume);
        }
    }

    void on(){isOn = true;
    }
    void off(){
        isOn = false;
    }


}
