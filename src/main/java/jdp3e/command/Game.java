package jdp3e.command;

//The receiver class

class Game {
	String gameName;

	public Game(String name) {
		this.gameName = name;
	}

	public void start() {
		System.out.println(gameName + " is on.");		
	}

	public void displayScore() {
		System.out.println("The score is changing from time to time.");
	}

	public void stop() {
		System.out.println("The game of " + gameName + " is stopped.");
	}
}