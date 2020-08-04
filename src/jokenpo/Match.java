package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Match {
	
	private Player player;
	private CPU cpu;
	
	Scanner sc = new Scanner(System.in);
	
	public Match() {
	}

	public Match(Player player, CPU cpu) {
		super();
		this.player = player;
		this.cpu = cpu;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	
	public void play() {
		
		int scoreboardCPU = 0, scoreboardPlayer = 0;
		boolean status = false;
		
		while (status == false) {
			System.out.println("0 - Rock; 1 - Paper; 2 - Scissors;");
			System.out.println();
			System.out.print("Type your move: ");
			int move = sc.nextInt();
			
			do { 
				if (move == 0 || move == 1 || move == 2) {
					status = true;
				} else {
					System.out.print("Invalid move. Type your move again: ");
					move = sc.nextInt();
				}
			} while (status == false);
			
			
			int moveCPU = cpu.moveCPU();
			System.out.println("CPU threw: " + moveCPU);
			System.out.println();
			
			if (move == moveCPU) {
				System.out.println("Draw!");
			} 
			else {
				switch (move) {
				case 0:
					if (moveCPU == 1) {
						System.out.println("Paper(1) wins Rock(0). CPU won!");
						scoreboardCPU++;
					} else {
						System.out.println("Rock(0) wins Scissors(2). You won!");
						scoreboardPlayer++;
					}
					break;
				case 1:
					if (moveCPU == 2) {
						System.out.println("Scissors(2) wins Paper(1). CPU won!");
						scoreboardCPU++;
					} else {
						System.out.println("Paper(1) wins Rock(0). You won!");
						scoreboardPlayer++;
					}
					break;
				case 2:
					if (moveCPU == 0) {
						System.out.println("Rock(0) wins Scissors(2). CPU won!");
						scoreboardCPU++;
					} else {
						System.out.println("Scissors(2) wins Paper(1). You won!");
						scoreboardPlayer++;
					}
					break;
				}
			}
			System.out.println();
			scoreboard(scoreboardCPU, scoreboardPlayer);
			System.out.println();
			status = playAgain();
 			System.out.println();	
		}
		sc.close();
	}
	
	public void scoreboard(int scoreCPU, int scorePlayer) {
		System.out.println("Scoreboard: ");
		System.out.printf("CPU %d x %d Player\n", scoreCPU, scorePlayer);
		player.record(scorePlayer);
		System.out.println();
	}
	
	public boolean playAgain() {
		System.out.println("Would you like to play again? (y / n)");
		char answer = sc.next().charAt(0);
		boolean status = false;
		if (answer == 'y' || answer == 'Y') {
			status = false;
		} else {
			status = true;
		}
		return status;
	}
}
