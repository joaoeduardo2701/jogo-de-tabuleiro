package Dado;

import java.util.Random;

public class Dado {
    public int numeroAtual;

    public int rolar() {
        Random numeroAleatorio = new Random();

        numeroAtual = numeroAleatorio.nextInt(1, 7);

        return numeroAtual;
    }
}
