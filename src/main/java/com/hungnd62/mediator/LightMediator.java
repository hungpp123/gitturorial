/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class LightMediator {
    private Set<Light> trafficSignls = new HashSet<>();
    public void registerLight(Light light) {
        trafficSignls.add(light);
    }
    public void unRegisterLight(Light light) {
        trafficSignls.remove(light);
    }
    public void notifyMediator(Light light) {
        System.out.println(light.getColor() + " is turned " + light.getCurrentState());
        if (light.getCurrentState() == Light.State.ON) {
            turnOffAllOtherLights(light);
        }
    }
    public void turnOffAllOtherLights(Light light) {
        for (Light otherLight : trafficSignls) {
            if (!light.equals(otherLight)) {
                otherLight.turnOff();
            }
        }
        System.out.println("--------");
    }
}
