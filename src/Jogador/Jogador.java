package Jogador;

import Dado.Dado;
import Tabuleiro.Tabuleiro;

public class Jogador {
    private int casaAtual;
    private int meuNumero;

    public Jogador(int meuNumero) {
        this.meuNumero = meuNumero;
        this.casaAtual = 0;
    }

    public void jogar(Dado dado, Tabuleiro tabuleiro) {
        int valorDado = dado.rolar();
        casaAtual += valorDado;
        if (casaAtual > tabuleiro.getNumeroCasas()) {
            casaAtual = tabuleiro.getNumeroCasas();
        }
        System.out.println("Jogador " + meuNumero + " rolou " + valorDado + " e está na casa " + casaAtual);
    }

    public int getCasaAtual() {
        return casaAtual;
    }

    public int getMeuNumero() {
        return meuNumero;
    }
}
