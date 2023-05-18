package com.kamko.springcourse;

import java.util.List;

public class RockMusic implements Music {
    private List<String> rockMusic = List.of(
            "Rock song 1",
            "Rock song 2",
            "Rock song 3"
    );

    @Override
    public List<String> getMusicList() {
        return rockMusic;
    }

    @Override
    public String toString() {
        return getMusicList().toString();
    }
}
