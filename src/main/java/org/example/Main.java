package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle auto = new Auto(1, "auto", 10);
        Vehicle fahhrad = new Fahrrad(2, "fahhrad", 10);
        System.out.println(auto.accelerate(20));
        System.out.println(fahhrad.accelerate(10));

    }
}