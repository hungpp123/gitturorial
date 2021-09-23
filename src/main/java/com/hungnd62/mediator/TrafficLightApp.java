/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.mediator;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class TrafficLightApp {
    public static void main(String[] args) {
        LightMediator lightMediator = new LightMediator();
        Light[] lights = {
                new Light("Red", lightMediator),
                new Light("Green", lightMediator),
                new Light("Yellow", lightMediator)
        };
        int currentLightIndex = 0;
        Light light;
        while(true) {
            if (currentLightIndex >= lights.length) {
                currentLightIndex = 0;
            }
            light = lights[currentLightIndex];
            light.turnOn();
            timer();
            currentLightIndex++;
        }
    }
    private static void timer() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
