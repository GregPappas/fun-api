package com.pappas.apifun.adapter;

import com.pappas.apifun.application.Happy;
import com.pappas.apifun.application.ImmutableHappy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmotionalChangesController {

    @GetMapping("/happiness")
    public Happy findHappiness() {
        return ImmutableHappy.builder().message("this is a happy message").build();
    }
}
