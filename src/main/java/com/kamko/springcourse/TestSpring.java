package com.kamko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic(Style.CLASSICAL));
        System.out.println(musicPlayer.playMusic(Style.ROCK));
        System.out.println(musicPlayer.playMusic(Style.JAZZ));

        context.close();
    }
}
