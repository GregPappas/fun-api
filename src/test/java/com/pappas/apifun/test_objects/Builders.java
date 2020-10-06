package com.pappas.apifun.test_objects;

import com.pappas.apifun.acl.Affirmation;
import com.pappas.apifun.acl.ImmutableAffirmation;
import com.pappas.apifun.application.Happy;
import com.pappas.apifun.application.ImmutableHappy;

public class Builders {

    private static final String MESSAGE = "this is a happy message";

    public static Happy buildHappy() {
        return ImmutableHappy.builder()
                .message(MESSAGE)
                .build();
    }

    public static Affirmation buildAffirmation() {
        return ImmutableAffirmation.builder()
                .affirmation(MESSAGE)
                .build();
    }
}
