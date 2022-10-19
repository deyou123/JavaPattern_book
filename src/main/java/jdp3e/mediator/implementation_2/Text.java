package jdp3e.mediator.implementation_2;


class Text {
	private ChatServer chatServer;
	String color;

	public Text(ChatServer chatServer, String color) {
		this.chatServer = chatServer;
		this.color=color;
		// self-registering back to the mediator(chatServer)
		chatServer.registerText(this);

	}

	public void makeDefaultColor() {
		System.out.println("Message text has a default color: "+ color);
	}

	public void makeBlueText() {
		System.out.println("***Message text becomes blue.***\n");
	}
}
