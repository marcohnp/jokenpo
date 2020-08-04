package application;

import java.util.Scanner;

import jokenpo.CPU;
import jokenpo.Match;
import jokenpo.Player;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		int record = 0;
		System.out.println();
		
		Player player = new Player(name, record);
		CPU cpu = new CPU();
		Match match = new Match(player, cpu);
		
		match.play();
		
		System.out.println(player.toString());
	}
}
