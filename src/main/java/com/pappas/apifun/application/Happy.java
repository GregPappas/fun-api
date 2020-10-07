package com.pappas.apifun.application;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableHappy.class)
@JsonDeserialize(as = ImmutableHappy.class)
public abstract class Happy {
    public abstract String getMessage();
    public abstract String dogPicture();
}
