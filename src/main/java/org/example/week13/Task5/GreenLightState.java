package org.example.week13.Task5;

public class GreenLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("[GREEN]transitioning to red");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Green");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("[GREEN]transitioning to yellow");
    }
}
