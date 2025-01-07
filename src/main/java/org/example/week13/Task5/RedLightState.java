package org.example.week13.Task5;

public class RedLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Red");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("[RED]transitioning to green");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("[RED]transitioning to yellow");
    }
}
