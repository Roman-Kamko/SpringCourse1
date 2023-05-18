package com.kamko.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class ClassicalMusic implements Music {
    private List<String> classicalMusic = List.of(
            "Classical song 1",
            "Classical song 2",
            "Classical song 3"
    );

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroying");
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
