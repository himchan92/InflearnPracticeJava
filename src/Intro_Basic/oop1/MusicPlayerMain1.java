package Intro_Basic.oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //켜기
        isOn = true;
        System.out.println("음악 플레이어 시작");

        //볼륨증가
        volume++;
        System.out.println("음악 볼륨 업 " + volume);
        volume++;
        System.out.println("음악 볼륨 업 " + volume);
        volume--;
        System.out.println("음악 볼륨 다운 " + volume);

        System.out.println("음악 상태 확인");
        if(isOn) {
            System.out.println("음악 On 볼륨 : " + volume);
        } else {
            System.out.println("음악 Off 볼륨 : " + volume);
        }
    }
}
