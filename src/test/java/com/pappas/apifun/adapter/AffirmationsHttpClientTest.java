package com.pappas.apifun.adapter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.pappas.apifun.acl.Affirmation;
import com.pappas.apifun.test_objects.Builders;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

class AffirmationsHttpClientTest {

    @DisplayName("test that when a get is called the rest template is invoked to get information from the api")
    @Test
    public void testInvocation() {
        //setup
        RestTemplate restTemplate = mock(RestTemplate.class);
        when(restTemplate.getForObject(anyString(), any())).thenReturn(Builders.buildAffirmation());
        AffirmationsHttpClient client = new AffirmationsHttpClient(restTemplate);
        //act
        Affirmation result = client.get();
        //verify
        assertThat(result).isEqualTo(Builders.buildAffirmation());
    }

}