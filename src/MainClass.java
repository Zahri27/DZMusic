
public class MainClass {
    public static void main(String[] args) {

        PopMusic popMusic = new PopMusic();
        RockMusic rockMusic = new RockMusic();
        ClassicMusic classicMusic = new ClassicMusic();


        MusicStyles[] musicStyles = {popMusic, rockMusic, classicMusic};


        for (MusicStyles style : musicStyles) {
            style.playMusic();
        }
    }
}
