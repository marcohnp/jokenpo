package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, placarComputador = 0, placarJogador = 0;
		
		while (cont == 0) {
			System.out.println("0 - Pedra; 1 - Papel; 2 - Tesoura;");
			System.out.println();
			System.out.print("Digite sua jogada: ");
			int jogada = sc.nextInt();
			
			do { 
				if (jogada == 0 || jogada == 1 || jogada == 2) {
					cont++;
				} else {
					System.out.print("Jogada Inválida. Digite sua jogada novamente: ");
					jogada = sc.nextInt();
				}
			} while (cont == 0);
			
			Random random = new Random();
			int jogadaComputador = random.nextInt(2);
			System.out.println("Computador jogou: " + jogadaComputador);
			System.out.println();
			
			if (jogada == jogadaComputador) {
				System.out.println("Empate!");
			} 
			else {
				switch (jogada) {
				case 0:
					if (jogadaComputador == 1) {
						System.out.println("Papel(1) ganha de Pedra(0). Computador ganhou!");
						placarComputador++;
					} else {
						System.out.println("Pedra(0) ganha de Tesoura(2). Você ganhou!");
						placarJogador++;
					}
					break;
				case 1:
					if (jogadaComputador == 2) {
						System.out.println("Tesoura(2) ganha de Papel(1). Computador ganhou!");
						placarComputador++;
					} else {
						System.out.println("Papel(1) ganha de Pedra(0). Você ganhou!");
						placarJogador++;
					}
					break;
				case 2:
					if (jogadaComputador == 0) {
						System.out.println("Pedra(0) ganha de Tesoura(2). Computador ganhou!");
						placarComputador++;
					} else {
						System.out.println("Tesoura(2) ganha de Papel(1). Você ganhou!");
						placarJogador++;
					}
					break;
				}
	
			}
			System.out.println();
			System.out.println("Placar: ");
			System.out.printf("Computador %d x %d Jogador\n", placarComputador, placarJogador);
			System.out.println();
			System.out.println("Gostaria de jogar novamente? (s/n)");
			sc.nextLine();
			char resposta = sc.next().charAt(0);
			cont = 0;
			if (resposta == 's' || resposta == 'S') {
				cont = 0;
			} else {
				cont++;
			}
 			System.out.println();
		} 
		
		sc.close();
	}
}
