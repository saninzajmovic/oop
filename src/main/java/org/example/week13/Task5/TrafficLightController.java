package org.example.week13.Task5;

public class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        TrafficLightState redState = new RedLightState();
        TrafficLightState greenState = new GreenLightState();
        TrafficLightState yellowState = new YellowLightState();

        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToGreen();
        context.transitionToGreen();
    }
}
