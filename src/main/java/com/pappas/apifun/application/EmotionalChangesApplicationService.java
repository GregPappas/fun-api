package com.pappas.apifun.application;

import com.pappas.apifun.acl.Affirmation;
import com.pappas.apifun.acl.Dog;
import com.pappas.apifun.adapter.AffirmationsHttpClient;
import com.pappas.apifun.adapter.DogHttpClient;
import org.springframework.stereotype.Service;

@Service
public class EmotionalChangesApplicationService {

    private final HappinessMapper happinessMapper;
    private final AffirmationsHttpClient affirmationsHttpClient;
    private final DogHttpClient dogHttpClient;

    public EmotionalChangesApplicationService(HappinessMapper happinessMapper,
                                              AffirmationsHttpClient affirmationsHttpClient,
                                              DogHttpClient dogHttpClient) {
        this.happinessMapper = happinessMapper;
        this.affirmationsHttpClient = affirmationsHttpClient;
        this.dogHttpClient = dogHttpClient;
    }

    public Happy findHappiness() {
        Affirmation affirmation = affirmationsHttpClient.get();
        Dog dog = dogHttpClient.findRandomDogPicture();
        return happinessMapper.toHappy(affirmation, dog);
    }
}
