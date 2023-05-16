package com.kamko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        Music rockMusic = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic.getSong());

        Music jazzMusic = context.getBean("jazzMusic", JazzMusic.class);
        System.out.println(jazzMusic.getSong());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        context.close();
    }
}
