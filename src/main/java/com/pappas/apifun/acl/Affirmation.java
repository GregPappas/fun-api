package com.pappas.apifun.acl;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableAffirmation.class)
public abstract class Affirmation {
    public abstract String getAffirmation();
}
