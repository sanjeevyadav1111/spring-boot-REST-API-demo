package com.arc.arc.common;

import org.springframework.stereotype.Component;

@Component
public class cricketcoach implements coach {
    @Override
    public String getworkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
