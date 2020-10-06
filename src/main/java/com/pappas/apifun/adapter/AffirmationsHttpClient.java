package com.pappas.apifun.adapter;

import com.pappas.apifun.acl.Affirmation;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AffirmationsHttpClient {

    private static final String AFFIRMATION_API_URI = "http://affirmations.dev";

    private RestTemplate applicationRestTemplate;

    public AffirmationsHttpClient(RestTemplate applicationRestTemplate) {
        this.applicationRestTemplate = applicationRestTemplate;
    }

    public Affirmation get() {
        return applicationRestTemplate.getForObject(AFFIRMATION_API_URI, Affirmation.class);
    }
}
