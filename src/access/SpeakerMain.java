package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; // volume을 private 필드로 만든 후에는 접근 불가
        speaker.showVolume(); // 볼륨이 200이 되어버리기... 폭발함

    }
}
