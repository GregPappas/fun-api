package com.pappas.apifun.application;

import static org.assertj.core.api.Assertions.assertThat;

import com.pappas.apifun.test_objects.Builders;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HappinessMapperTest {

    @Test
    @DisplayName("affirmation can be mapped to a happiness object")
    public void testHappyPathFromAffirmation() {
        //setup
        HappinessMapper happinessMapper = new HappinessMapper();
        //act
        Happy result = happinessMapper.toHappy(Builders.buildAffirmation());
        //verify
        assertThat(result).isEqualTo(Builders.buildHappy());
    }
}