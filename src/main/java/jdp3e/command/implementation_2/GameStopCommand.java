package jdp3e.command.implementation_2;

// The GameStopCommand class

class GameStopCommand implements Command {
	private Game game;

	public GameStopCommand(Game game) {
		this.game = game;
	}

	@Override
	public void executeCommand() {
		System.out.println("Finishing the game.");
		game.stop();
	}

	@Override
	public void undoPreviousCommand() {
		System.out.println("Undoing the stop command.");
		game.start();
		game.displayScore();
	}
}
