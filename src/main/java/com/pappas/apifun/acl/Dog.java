package com.pappas.apifun.acl;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableDog.class)
public abstract class Dog {
    public abstract String getMessage();
}
