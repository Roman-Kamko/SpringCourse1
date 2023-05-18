package com.kamko.springcourse;

import java.util.List;

public class JazzMusic implements Music {
    private List<String> jazzMusic = List.of(
            "Jazz song 1",
            "Jazz song 2",
            "Jazz song 3"
    );

    @Override
    public List<String> getMusicList() {
        return jazzMusic;
    }

    @Override
    public String toString() {
        return getMusicList().toString();
    }
}
