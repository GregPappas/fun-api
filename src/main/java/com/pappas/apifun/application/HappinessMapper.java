package com.pappas.apifun.application;

import com.pappas.apifun.acl.Affirmation;
import com.pappas.apifun.acl.Dog;
import org.springframework.stereotype.Component;

@Component
public class HappinessMapper {

    public Happy toHappy(Affirmation affirmation, Dog dog) {
        return ImmutableHappy.builder()
                .message(affirmation.getAffirmation())
                .dogPicture(dog.getMessage())
                .build();
    }
}
