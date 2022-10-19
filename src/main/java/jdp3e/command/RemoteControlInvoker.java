package jdp3e.command;

// The RemoteControlInvoker class(Invoker)

class RemoteControlInvoker {
	Command currentCommand, lastCommandPerformed;

	public void setCommand(Command command) {
		this.currentCommand = command;
	}

	public void executeSelectedCommand() {
		currentCommand.executeCommand();
		lastCommandPerformed = currentCommand;
	}

	public void undoCommand() {
		// Undo the last command executed
		lastCommandPerformed.undoPreviousCommand();
	}
}
