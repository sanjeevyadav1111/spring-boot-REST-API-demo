package com.arc.arc.common;

import org.springframework.stereotype.Component;

@Component
public class baseballcoach implements  coach{

    @Override
    public String getworkout() {
        return " spend 30 mins in practice";
    }
}
