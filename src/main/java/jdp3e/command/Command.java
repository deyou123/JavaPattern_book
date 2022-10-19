package jdp3e.command;


// The command interface

interface Command {
	
	// To execute a command
	void executeCommand();
	
	// To undo last command execution
	void undoPreviousCommand();
}
