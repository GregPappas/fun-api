package com.pappas.apifun.application;

import org.springframework.stereotype.Service;

@Service
public class EmotionalChangesApplicationService {

    public Happy findHappiness() {
        return ImmutableHappy.builder().message("this is a happy message").build();
    }

}
