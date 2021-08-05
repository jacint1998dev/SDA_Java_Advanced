package com.sda.java_advanced_coding.exercises.ex16;

import java.time.Duration;

/**
 * Create an enum Runner class with constants BEGINNER, INTERMEDIATE, ADVANCED. Enum should have two
 * parameters:
 * • minimum time of running a marathon in minutes
 * • maximum running time of the marathon in minutes
 * In addition, the Runner enum should contain the static getFitnessLevel() method, which takes any time
 * result of a marathon run, and as a result should return a specific Runner object based on the given time.
 */
public enum Runner {
    BEGINNER(Duration.ofMinutes(2), Duration.ofMinutes(5)),
    INTERMEDIATE(Duration.ofMinutes(5), Duration.ofMinutes(10)),
    ADVANCED(Duration.ofMinutes(10), Duration.ofMinutes(60));

    private Duration minimumTime;
    private Duration maximumTime;


    Runner(Duration minimumTime, Duration maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public static Runner getFitnessLevel(Duration runningDuration) {
        if (runningDuration.getSeconds() > ADVANCED.maximumTime.getSeconds()) {
            System.out.println("No one can run that much!");
            return null;
        }
        if (runningDuration.getSeconds() <= ADVANCED.maximumTime.getSeconds()
                && runningDuration.getSeconds() >= ADVANCED.minimumTime.getSeconds()) {
            return ADVANCED;
        }
        if (runningDuration.getSeconds() < INTERMEDIATE.maximumTime.getSeconds()
                && runningDuration.getSeconds() >= INTERMEDIATE.minimumTime.getSeconds()) {
            return INTERMEDIATE;
        }
        if (runningDuration.getSeconds() < BEGINNER.maximumTime.getSeconds()
                && runningDuration.getSeconds() >= BEGINNER.minimumTime.getSeconds()) {
            return BEGINNER;
        }
        System.out.println("There is no such runner!");
        return null;
    }
}
