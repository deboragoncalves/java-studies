package com.debora.exercicios.orientacaoobjetos.parte01.desafio05;

public class Food {

    private String name;
    private double weight;

    public Food() {
    }

    public Food(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Comida: \nNome: " + this.getName() + "\nPeso: " + this.getWeight() + " kg";
    }
}
