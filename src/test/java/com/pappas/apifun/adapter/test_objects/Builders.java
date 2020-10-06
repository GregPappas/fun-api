package com.pappas.apifun.adapter.test_objects;

import com.pappas.apifun.application.Happy;
import com.pappas.apifun.application.ImmutableHappy;

public class Builders {
    public static Happy buildHappy() {
        return ImmutableHappy.builder()
                .message("this is a happy message")
                .build();
    }
}
