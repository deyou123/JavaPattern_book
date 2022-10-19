package jdp3e.chain_of_responsibility;

// EmailErrorHandler class

class EmailErrorHandler implements Handler {
	private Handler nextHandler;

	@Override
	public void nextErrorHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleMessage(Message message) {
		if (message.text.contains("email")) {
			// Error message contains both-'email' and 'fax'
			if (message.text.contains("fax")) {
				System.out.println("-EmailErrorHandler fixed the email issue: " + message.text);
				System.out.println("--Now FaxErrorHandler needs to cross verify it.");
				if (nextHandler != null) {
					nextHandler.handleMessage(message);
				}
			}
			// It's an email error only.
			else {
				System.out.println("EmailErrorHandler processed the issue: "+ message.text);
			}
		}
		// Neither a fax issue nor an email issue
		else {
			if (nextHandler != null) {
				nextHandler.handleMessage(message);
			}
		}
	}
}
