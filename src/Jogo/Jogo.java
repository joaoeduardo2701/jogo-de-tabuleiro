package Jogo;

import Dado.Dado;
import Jogador.Jogador;
import Tabuleiro.Tabuleiro;

import java.util.ArrayList;

public class Jogo {
    private Tabuleiro meuTabuleiro;
    private ArrayList<Jogador> meusJogadores;
    private Dado meuDado;
    private boolean jogoAtivo;

    public Jogo(int numeroCasas, int numeroJogadores) {
        meuTabuleiro = new Tabuleiro(numeroCasas);
        meuDado = new Dado();
        meusJogadores = new ArrayList<>();
        for (int i = 1; i <= numeroJogadores; i++) {
            meusJogadores.add(new Jogador(i));
        }
        jogoAtivo = true;
    }

    public void proximaJogada() {
        for (Jogador jogador : meusJogadores) {
            jogador.jogar(meuDado, meuTabuleiro);
            if (jogador.getCasaAtual() == meuTabuleiro.getNumeroCasas()) {
                System.out.println("Jogador " + jogador.getMeuNumero() + " venceu!");
                jogoAtivo = false;
                break;
            }
        }
    }

    public void mostrarPosicoes() {
        for (Jogador jogador : meusJogadores) {
            System.out.println("Jogador " + jogador.getMeuNumero() + " está na casa " + jogador.getCasaAtual());
        }
    }

    public boolean isJogoAtivo() {
        return jogoAtivo;
    }
}
