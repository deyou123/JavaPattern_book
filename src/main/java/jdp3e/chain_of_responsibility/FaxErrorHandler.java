package jdp3e.chain_of_responsibility;

// FaxErrorHandler class

class FaxErrorHandler implements Handler {
	private Handler nextHandler;

	@Override
	public void nextErrorHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleMessage(Message message) {
		if (message.text.contains("fax")) {
			// Error message contains both- 'fax' and 'email'
			if (message.text.contains("email")) {
				System.out.println("-FaxErrorHandler fixed the fax issue: " + message.text);
				System.out.println("--Now EmailErrorHandler needs to cross verify it.");
				if (nextHandler != null) {
					nextHandler.handleMessage(message);
				}

			}
			// It's a fax error only.
			else {
				System.out
						.println("FaxErrorHandler processed the issue: " + message.text);
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
