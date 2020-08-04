package jokenpo;

public class Player {
	
	private String name;
	private int record;
	
	public Player() {
	}

	public Player(String name, int record) {
		super();
		this.name = name;
		this.record = record;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getRecord() {
		return record;
	}
	
	public void setRecord(int record) {
		this.record = record;
	}
	
	public int record(int value) {
		record = value;
		return record;
	}

	@Override
	public String toString() {
		return name +"'s record is " + record;
	}
	
	
}
