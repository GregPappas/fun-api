package com.pappas.apifun.adapter;

import com.pappas.apifun.application.EmotionalChangesApplicationService;
import com.pappas.apifun.application.Happy;
import com.pappas.apifun.application.ImmutableHappy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmotionalChangesController {

    private EmotionalChangesApplicationService emotionalChangesApplicationService;

    public EmotionalChangesController(EmotionalChangesApplicationService emotionalChangesApplicationService) {
        this.emotionalChangesApplicationService = emotionalChangesApplicationService;
    }

    @GetMapping("/happiness")
    public Happy findHappiness() {
        return emotionalChangesApplicationService.findHappiness();
    }
}
