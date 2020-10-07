package com.pappas.apifun.application;

import com.pappas.apifun.acl.Affirmation;
import org.springframework.stereotype.Component;

@Component
public class HappinessMapper {

    private static final String DOG_PICTURE_URL = "http://url-for-a-random-dog-picture.com";

    public Happy toHappy(Affirmation affirmation) {
        return ImmutableHappy.builder()
                .message(affirmation.getAffirmation())
                .dogPicture(DOG_PICTURE_URL)
                .build();
    }
}
