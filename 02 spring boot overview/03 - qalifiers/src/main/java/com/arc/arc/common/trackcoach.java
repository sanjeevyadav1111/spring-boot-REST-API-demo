package com.arc.arc.common;

import org.springframework.stereotype.Component;

@Component
public class trackcoach implements coach{
    @Override
    public String getworkout() {
        return "run hard 5k";
    }
}
