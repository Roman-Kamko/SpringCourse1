package com.kamko.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JazzMusic implements Music {
    private Style style = Style.JAZZ;
    private List<String> jazzMusic = List.of(
            "Jazz song 1",
            "Jazz song 2",
            "Jazz song 3"
    );

    public Style getStyle() {
        return style;
    }

    @Override
    public List<String> getMusicList() {
        return jazzMusic;
    }
    @Override
    public String toString() {
        return getMusicList().toString();
    }
}
