package com.arc.arc.common;

import org.springframework.stereotype.Component;

@Component
public class tenniscoach implements coach{
    @Override
    public String getworkout() {
        return "practice your goal";
    }
}
