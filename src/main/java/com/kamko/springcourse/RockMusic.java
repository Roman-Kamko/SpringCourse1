package com.kamko.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {
    private Style style = Style.ROCK;
    private List<String> rockMusic = List.of(
            "Rock song 1",
            "Rock song 2",
            "Rock song 3"
    );

    public Style getStyle() {
        return style;
    }

    @Override
    public List<String> getMusicList() {
        return rockMusic;
    }
    @Override
    public String toString() {
        return getMusicList().toString();
    }
}
