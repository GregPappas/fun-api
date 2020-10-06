package com.pappas.apifun.application;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.pappas.apifun.adapter.AffirmationsHttpClient;
import com.pappas.apifun.test_objects.Builders;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmotionalChangesApplicationServiceTest {

    private AffirmationsHttpClient affirmationsHttpClient = mock(AffirmationsHttpClient.class);

    @DisplayName("verify that when an Affirmation is returned from the affirmation client then it is converted into a Happy object")
    @Test
    public void testAffirmation() {
        //setup
        when(affirmationsHttpClient.get()).thenReturn(Builders.buildAffirmation());

        HappinessMapper happinessMapper = new HappinessMapper();
        EmotionalChangesApplicationService emotionalChangesApplicationService = new EmotionalChangesApplicationService(happinessMapper, affirmationsHttpClient);
        //act
        Happy happy = emotionalChangesApplicationService.findHappiness();
        //verify
        assertThat(happy).isEqualTo(Builders.buildHappy());
    }
}