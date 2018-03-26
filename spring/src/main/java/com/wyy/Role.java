package com.wyy;

import org.springframework.stereotype.Component;

@Component
public class Role {
    private String name="role";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
