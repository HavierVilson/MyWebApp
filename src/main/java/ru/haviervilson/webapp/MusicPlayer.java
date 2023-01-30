package ru.haviervilson.webapp;

public class MusicPlayer {
    private Music music;

    //IoC | Инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
