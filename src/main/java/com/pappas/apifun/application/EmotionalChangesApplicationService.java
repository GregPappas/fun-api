package com.pappas.apifun.application;

import com.pappas.apifun.acl.ImmutableAffirmation;
import org.springframework.stereotype.Service;

@Service
public class EmotionalChangesApplicationService {

    private HappinessMapper happinessMapper;

    public EmotionalChangesApplicationService(HappinessMapper happinessMapper) {
        this.happinessMapper = happinessMapper;
    }

    public Happy findHappiness() {
        return happinessMapper.toHappy(ImmutableAffirmation.builder().message("this is a happy message").build());
    }
}
