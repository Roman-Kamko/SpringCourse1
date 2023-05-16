package com.kamko.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "What a wonderful world";
    }
}
