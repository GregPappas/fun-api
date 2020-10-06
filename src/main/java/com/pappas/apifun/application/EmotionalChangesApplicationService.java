package com.pappas.apifun.application;

import com.pappas.apifun.acl.Affirmation;
import com.pappas.apifun.adapter.AffirmationsHttpClient;
import org.springframework.stereotype.Service;

@Service
public class EmotionalChangesApplicationService {

    private HappinessMapper happinessMapper;
    private AffirmationsHttpClient affirmationsHttpClient;

    public EmotionalChangesApplicationService(HappinessMapper happinessMapper,
                                              AffirmationsHttpClient affirmationsHttpClient) {
        this.happinessMapper = happinessMapper;
        this.affirmationsHttpClient = affirmationsHttpClient;
    }

    public Happy findHappiness() {
        Affirmation affirmation = affirmationsHttpClient.get();
        return happinessMapper.toHappy(affirmation);
    }
}
