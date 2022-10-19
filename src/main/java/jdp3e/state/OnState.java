package jdp3e.state;

// This class describes the on state behavior

class OnState implements PossibleState {
	public OnState() {
		System.out.println("The TV is On now.\n");
	}

	// TV is already On. The user presses the On button now.
	@Override
	public void pressOnButton(Television tvContext) {
		System.out.print("The TV was already on.");
		System.out.println(" Ignoring repeated on button press operation.");
	}

	// TV is already On. The user presses the off button now.
	@Override
	public void pressOffButton(Television tvContext) {
		System.out.println("The TV was on. So,switching off the TV.");
		tvContext.setCurrentState(new OffState());
	}

	// TV is already On. The user presses the mute button now.
	@Override
	public void pressMuteButton(Television tvContext) {
		System.out.println("The TV was on. So,moving to the silent mode.");
		tvContext.setCurrentState(new MuteState());
	}
	@Override
	public String toString(){
		return " Switched on.";
	}
}