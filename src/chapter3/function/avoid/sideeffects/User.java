package chapter3.function.avoid.sideeffects;

import java.util.SplittableRandom;

public class User {
    private String name;
    private boolean isActive;

    public User(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public boolean isActive() {
        return isActive;
    }

}
