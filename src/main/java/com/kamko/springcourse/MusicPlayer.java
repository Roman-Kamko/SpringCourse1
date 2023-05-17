package com.kamko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public MusicPlayer() {
    }

    public String playMusic(Style style) {
        switch (style) {
            case CLASSICAL -> {
                return getRandomSong(classicalMusic.getMusicList());
            }
            case ROCK -> {
                return getRandomSong(rockMusic.getMusicList());
            }
            case JAZZ -> {
                return getRandomSong(jazzMusic.getMusicList());
            }
        }
        return "не поддерживаемый стиль";
    }

    public String getRandomSong(List<String> musicList) {
        Random random = new Random();
        return musicList.get(random.nextInt(3));
    }
}
