package jdp3e.state;

class Client {

	public static void main(String[] args) {
		System.out.println("***State Pattern Demonstration.***\n");
		// TV is initialized with Off state.
		Television tv = new Television ();
		System.out.println("User is pressing buttons in the following sequence:");
		System.out.println("Off->Mute->On->On->Mute->Mute->On->Off\n");
		// TV is off. Pressing the off button again.
		tv.executeOffButton();
		// Pressing the mute button when the TV is On
		tv.executeMuteButton();
		
		//Checking the current state
		System.out.println("Current state:"+ tv.getCurrentState());
		
		// Switching on the television.
		tv.executeOnButton();
		
		//Checking the current state
		System.out.println("Current state:"+ tv.getCurrentState());
		
		// Pressing the On button again when the TV is On
		tv.executeOnButton();
		// Putting the TV in the mute mode.
		tv.executeMuteButton();
		// TV is already muted. Pressing Mute button again
		tv.executeMuteButton();
		
		//Checking the current state
		System.out.println("Current state:"+ tv.getCurrentState());
		
		// TV is silent now. Pressing the On Button now.
		tv.executeOnButton();
		// Switching off the TV now.
		tv.executeOffButton();
		
		System.out.println("Current state:"+ tv.getCurrentState());

	}
}
