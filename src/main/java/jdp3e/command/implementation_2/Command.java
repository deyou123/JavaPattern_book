package jdp3e.command.implementation_2;

//The command interface

interface Command {

	// To execute a command
	void executeCommand();

	// To undo last command execution
	void undoPreviousCommand();
}
