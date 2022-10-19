package jdp3e.command.implementation_2;

import java.util.ArrayList;

//The RemoteControlInvoker class(Invoker)

class RemoteControlInvoker {
	Command currentCommand, lastCommandPerformed;
	ArrayList<Command> savedCommands = new ArrayList<Command>();

	public void setCommand(Command command) {
		this.currentCommand = command;
	}

	public void executeCommand() {
		currentCommand.executeCommand();
		savedCommands.add(currentCommand);
		lastCommandPerformed = currentCommand;
	}

	public void undoCommand() {
		// Undo the last command executed
		lastCommandPerformed.undoPreviousCommand();
		// Remove it from saved command list
		savedCommands.remove(lastCommandPerformed);
	}

	public void undoAllStoredCommands() {
		for (int i = savedCommands.size(); i > 0; i--) {
			// Get a restore point and undo previous commands
			(savedCommands.get(i - 1)).undoPreviousCommand();			
		}
		// Removing everything from the saved list now.
		savedCommands.clear();
	}

}
