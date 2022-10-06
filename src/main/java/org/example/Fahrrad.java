package org.example;

public class Fahrrad extends  Vehicle{
    public Fahrrad(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        int newKmh = getVelocity() + kmh;
        if(newKmh <= 35){
            System.out.println("Die neue Fahhrad Endgeschwindigkeit ist : " + newKmh);
            return newKmh;
        }
        throw new RuntimeException("Geschwindigkeit darf nicht 35 kmh überschritten werden");
    }

}
