package jdp3e.command;

class Client {

	public static void main(String[] args) {
		System.out.println("***Command Pattern Demonstration.***\n");

		// Receiver
		Game gameName = new Game("Golf");

		// Command objects:

		// Command to start the game
		GameStartCommand gameStartCommand = new GameStartCommand(gameName);
		// Command to stop the game
		GameStopCommand gameStopCommand = new GameStopCommand(gameName);

		// Invoker
		RemoteControlInvoker invoker = new RemoteControlInvoker();

		System.out.println("---Testing Scenario-1---\n");

		System.out.println("Starting the game using a command.");
		invoker.setCommand(gameStartCommand);
		invoker.executeSelectedCommand();
		System.out.println("\nUndoing the previous command now.");
		invoker.undoCommand();

		System.out.println("\n---Testing Scenario-2---\n");

		System.out.println("Starting the game again.");
		invoker.setCommand(gameStartCommand);
		invoker.executeSelectedCommand();
		System.out.println("\nIssuing a stop command now.");
		invoker.setCommand(gameStopCommand);
		invoker.executeSelectedCommand();
		System.out.println("\nUndoing the previous command now.");
		invoker.undoCommand();

		// OPTIONAL: Introduced for the "Q&A Session"
		System.out.println("\n---Testing Scenario-3---");
		System.out.println("Playing a different game now.\n");

		// Receiver
		gameName = new Game("Soccer");
		// Command to start the game
		gameStartCommand = new GameStartCommand(gameName);
		// Command to stop the game
		gameStopCommand = new GameStopCommand(gameName);

		System.out.println("Starting the game using a command.");
		invoker.setCommand(gameStartCommand);
		invoker.executeSelectedCommand();
		System.out.println("\nUndoing the previous command now.");
		invoker.undoCommand();

	}

}
