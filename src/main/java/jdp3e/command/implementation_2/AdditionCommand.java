package jdp3e.command.implementation_2;


class AdditionCommand implements Command {
	private NumberGenerator numberGenerator;
	public AdditionCommand(NumberGenerator receiver){
		this.numberGenerator = receiver;
	}
	@Override
	public void executeCommand() {
		numberGenerator.incrementNumber();  
	}
	@Override
	public void undoPreviousCommand() {		
		numberGenerator.decrementNumber();	
	}	
}
