package jdp3e.chain_of_responsibility;

interface Handler {
	void handleMessage(Message message);
	void nextErrorHandler(Handler nextHandler);
}