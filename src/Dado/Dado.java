package Dado;

import java.util.Random;

public class Dado {
    public int rolar() {
        Random numeroAleatorio = new Random();

        return numeroAleatorio.nextInt(1, 7);
    }
}
