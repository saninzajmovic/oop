package org.example.week13.Task5;

public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void transitionToRed() {
        this.state.transitionToRed();
    }

    public void transitionToGreen() {
        this.state.transitionToGreen();
    }

    public void transitionToYellow() {
        this.state.transitionToYellow();
    }
}
