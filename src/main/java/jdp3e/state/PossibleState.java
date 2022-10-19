package jdp3e.state;

interface PossibleState {
	// Users can press any of these buttons-On, Off or Mute
	void pressOnButton(Television tvContext);

	void pressOffButton(Television tvContext);

	void pressMuteButton(Television tvContext);
}
