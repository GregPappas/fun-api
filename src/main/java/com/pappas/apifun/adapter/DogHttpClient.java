package com.pappas.apifun.adapter;

import com.pappas.apifun.acl.Dog;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DogHttpClient {

    private static final String DOG_API_URI = "https://dog.ceo/api/breeds/image/random";

    private RestTemplate applicationRestTemplate;

    public DogHttpClient(RestTemplate applicationRestTemplate) {
        this.applicationRestTemplate = applicationRestTemplate;
    }

    public Dog findRandomDogPicture() {
        return applicationRestTemplate.getForObject(DOG_API_URI, Dog.class);
    }
}
