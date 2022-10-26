package homeWork13;

public class MusicMain {
    public static void main(String[] args) {

        MusicStyles[] group = {new RockMusic("Metallica"),
                new ClassicMusic("Ludovico Einaudi"),
                new PopMusic("Maroon 5")};


        for (MusicStyles musicStyles : group) {
            System.out.println(musicStyles.groupName + ":");
            musicStyles.playedMusic();
            System.out.println();

        }


    }

}

