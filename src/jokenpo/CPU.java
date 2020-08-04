package jokenpo;

import java.util.Random;

public class CPU {
	
	private Random random = new Random();
	
	public CPU() {
	}
	
	public int moveCPU() {
		int move = random.nextInt(2);
		return move;
	}

}
