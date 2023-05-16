package com.kamko.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("doing initialization");
    }
    public void doMyDestroy() {
        System.out.println("doing destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
