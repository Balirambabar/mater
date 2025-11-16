package com.springboot;

public class Car  {

    public void drive() {
        Engine e=new Engine();
        int status= e.start();
        if(status>=1)
        {
            System.out.println("journey started");
        }
        else {
            System.out.println("journey stopped");
        }
    }
}
