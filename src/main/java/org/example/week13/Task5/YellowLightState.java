package org.example.week13.Task5;

public class YellowLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("[YELLOW]transitioning to red");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("[YELLOW]transitioning to green");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Yellow");
    }
}
