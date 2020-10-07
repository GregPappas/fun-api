package com.pappas.apifun.test_objects;

import com.pappas.apifun.acl.Affirmation;
import com.pappas.apifun.acl.Dog;
import com.pappas.apifun.acl.ImmutableAffirmation;
import com.pappas.apifun.acl.ImmutableDog;
import com.pappas.apifun.application.Happy;
import com.pappas.apifun.application.ImmutableHappy;

public class Builders {

    private static final String MESSAGE = "this is a happy message";
    private static final String DOG_PICTURE = "http://url-for-a-random-dog-picture.com";

    public static Happy buildHappy() {
        return ImmutableHappy.builder()
                .message(MESSAGE)
                .dogPicture(DOG_PICTURE)
                .build();
    }

    public static Affirmation buildAffirmation() {
        return ImmutableAffirmation.builder()
                .affirmation(MESSAGE)
                .build();
    }

    public static Dog buildDog() {
        return ImmutableDog.builder()
                .message(DOG_PICTURE)
                .build();
    }
}
