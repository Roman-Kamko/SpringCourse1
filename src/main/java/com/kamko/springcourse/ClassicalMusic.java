package com.kamko.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private Style style = Style.CLASSICAL;

    private List<String> classicalMusic = List.of(
            "Classical song 1",
            "Classical song 2",
            "Classical song 3"
    );

    public Style getStyle() {
        return style;
    }

    @Override
    public List<String> getMusicList() {
        return classicalMusic;
    }

    @Override
    public String toString() {
        return getMusicList().toString();
    }
}
