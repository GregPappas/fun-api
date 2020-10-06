package com.pappas.apifun.application;

import com.pappas.apifun.acl.Affirmation;
import org.springframework.stereotype.Component;

@Component
public class HappinessMapper {

    public Happy toHappy(Affirmation affirmation) {
        return ImmutableHappy.builder()
                .message(affirmation.getMessage())
                .build();
    }
}
