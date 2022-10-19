package jdp3e.state;

// This class describes the mute state behavior

class MuteState implements PossibleState {

	public MuteState() {
		System.out.println("The TV is in Mute mode now.\n");
	}

	// TV is muted,but the user presses the Off button
	
	@Override
	public void pressOnButton(Television tvContext) {
		System.out.print("The TV was in mute mode.");
		System.out.println(" So, moving to the normal state.");
		tvContext.setCurrentState(new OnState());
	}

	// TV is muted, but the user presses the Off button
	
	@Override
	public void pressOffButton(Television tvContext) {
		System.out.print(" The TV was in mute mode.");
		System.out.println(" So, switching off the TV.");
		tvContext.setCurrentState(new OffState());
	}

	// TV is muted, but the user press the mute button again
	
	@Override
	public void pressMuteButton(Television tvContext) {
		System.out.print("The TV was already in Mute mode.");
		System.out.println(" So, ignoring this operation.");

	}
	@Override
	public String toString(){
		return " Mute mode.";
	}
}