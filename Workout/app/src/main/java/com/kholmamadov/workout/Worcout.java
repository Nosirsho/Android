package com.kholmamadov.workout;

public class Worcout {
    private String name;
    private String description;

    public Worcout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static final Worcout[] worcouts = {
            new Worcout("The limb Loosener", "5 Handstands push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Worcout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Worcout("The Wimp Special", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };
}
