package oop1;

// 절차지향 프로그래밍 - 메서드 생성을 통해(기능을 전부 모듈화)
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        System.out.println("음악 플레이어를 시작합니다");
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        playerStatus(data);
        off(data);
        System.out.println("음악 플레이어를 종료합니다.");

    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void playerStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: "+ data.volume);
        } else{
            System.out.println("음악 플레이어 OFF, 볼륨: " + data.volume);
        }
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
    }
}
