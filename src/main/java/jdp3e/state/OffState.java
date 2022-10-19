package jdp3e.state;

// Subclasses do not contain any local state.
// Only one unique instance of IPossibleStates is required.
// This class describes the off state behavior

class OffState implements PossibleState {
	public OffState() {
		System.out.println("The TV is Off now.\n");
	}

	// TV was off. The user presses the On button now.
	@Override
	public void pressOnButton(Television tvContext) {
		System.out.println("The TV was Off. Going from Off to On state.");
		tvContext.setCurrentState(new OnState());
	}

	// TV was off. The user presses the Off button now.
	@Override
	public void pressOffButton(Television tvContext) {
		System.out.print("The TV was already in Off state.");
		System.out.println(" So, ignoring this operation.");
	}

	// TV was off. The user presses the mute button now.
	@Override
	public void pressMuteButton(Television tvContext) {
		System.out.print("The TV was already off.");
		System.out.println(" So, ignoring this operation.");
	}

	@Override
	public String toString() {
		return " Switched off.";
	}

}
