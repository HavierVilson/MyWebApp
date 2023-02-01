package ru.haviervilson.webapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Lesson 5

//        RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);
//        System.out.println(rockMusic.getSong());

        ClassicMusic classicMusic = context.getBean("musicBean", ClassicMusic.class);
        System.out.println(classicMusic.getSong());

//        Lesson 2

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        Lesson 3

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

        context.close();
    }
}
