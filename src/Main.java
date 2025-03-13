import Jogo.Jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de casas do tabuleiro: ");
        int numeroCasas = scanner.nextInt();
        System.out.print("Digite o número de jogadores: ");
        int numeroJogadores = scanner.nextInt();

        Jogo jogo = new Jogo(numeroCasas, numeroJogadores);

        while (jogo.isJogoAtivo()) {
            System.out.println("\nMENU");
            System.out.println("1 - Iniciar nova partida");
            System.out.println("2 - Executar jogada");
            System.out.println("3 - Informar posições");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Jogo já está em andamento!");
                    break;
                case 2:
                    jogo.proximaJogada();
                    break;
                case 3:
                    jogo.mostrarPosicoes();
                    break;
                case 0:
                    System.out.println("Saindo do jogo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        System.out.println("Jogo finalizado!");
        scanner.close();
    }
}
