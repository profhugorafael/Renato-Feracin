package com.renato.entities;

import com.renato.entities.enums.Color;

public class Circulo extends FormaAbstrata implements Comparable<Circulo> {

    private static final double PI = 3.14159265;
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo(Double espessura, Color cor, Double raio) {
        super(espessura, cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI*raio*raio;
    }

    @Override
    public double perimetro() {
        return 2*PI*raio;
    }

    @Override
    public int compareTo(Circulo other) {
        if ( this.raio > other.raio ) return 1;
        if ( this.raio < other.raio ) return -1;
        if ( this.espessura > other.espessura ) return -1;
        if ( this.espessura < other.espessura ) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", espessura=" + espessura +
                ", cor=" + cor +
                "} ";
    }
}
