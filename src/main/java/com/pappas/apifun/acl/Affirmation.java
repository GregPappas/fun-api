package com.pappas.apifun.acl;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Affirmation {
    public abstract String getMessage();
}
