package org.example;

public abstract class Vehicle implements Accelerateable{
    protected int id;
    protected String name;
    protected int velocity;

    public Vehicle(int id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
