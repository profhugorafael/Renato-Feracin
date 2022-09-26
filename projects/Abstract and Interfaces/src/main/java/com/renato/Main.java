package com.renato;

import com.renato.entities.Circulo;
import com.renato.entities.enums.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Circulo> formas = new ArrayList<>();

        formas.add(new Circulo(2.3, Color.YELLOW, 3.3));
        formas.add(new Circulo(2.31, Color.YELLOW, 4.4));
        formas.add(new Circulo(2.37, Color.YELLOW, 4.4));
        formas.add(new Circulo(2.3, Color.YELLOW, 2.2));
        formas.add(new Circulo(2.33, Color.YELLOW, 4.4));

        Collections.sort(formas);

        // formas.sort(Comparator.comparingDouble(Circulo::getRaio));

        formas.forEach(System.out::println);

    }
}