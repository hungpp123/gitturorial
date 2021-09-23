/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.mediator;

/**
 *
 * @author Admin
 */
public class Light {
    enum State {
        ON, OFF
    }
    
    private String color;
    private LightMediator lightMediator;
    private State currentState;
    public Light(String color, LightMediator lightMediator) {
        this.color = color;
        this.currentState = State.OFF;
        this.lightMediator = lightMediator;
        lightMediator.registerLight(this);
    }
    public void turnOn() {
        this.currentState = State.ON;
        lightMediator.notifyMediator(this);
    }
    public void turnOff() {
        this.currentState = State.OFF;
        lightMediator.notifyMediator(this);
    }
    public String getColor() {
        return color;
    }
    public State getCurrentState() {
        return currentState;
    }
    
    public int hashCode() {
        return color.hashCode();
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Light light = (Light) obj;
        return color.equals(light.color);
    }
}
