package jdp3e.command;

// The GameStartCommand class

class GameStartCommand implements Command {
	private Game game;

	public GameStartCommand(Game game) {
		this.game = game;
	}

	@Override
	public void executeCommand() {
		System.out.println("The game is about to start.");
		game.start();
		game.displayScore();
	}

	@Override
	public void undoPreviousCommand() {
		System.out.println("Undoing the start command.");
		game.stop();
	}
}
