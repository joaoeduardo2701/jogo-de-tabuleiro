package Dado;

import java.util.Random;

public class Dado {
    private int numeroAtual;
    private Random random = new Random();

    public int rolar() {
        numeroAtual = random.nextInt(6) + 1;
        return numeroAtual;
    }
}
