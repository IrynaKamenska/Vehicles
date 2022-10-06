package org.example;

public class Auto extends Vehicle{
    public Auto(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        System.out.printf("Geschwindigkeit wird auf " + kmh + " erhöht ");
        int newKmh = getVelocity() + kmh;
        System.out.println(" Die neue Auto Endgeschwindigkeit ist : " + newKmh);
        return newKmh;

    }
}
