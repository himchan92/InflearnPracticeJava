package Intro_Basic.oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        musicPlayerData.isOn = true; //켜기
        musicPlayerData.volume++;
        System.out.println("음악 켜기");
        System.out.println("음악 on 볼륨 : " + musicPlayerData.volume);
    }
}
