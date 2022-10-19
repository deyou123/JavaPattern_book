package jdp3e.singleton.implementation_4;
//Bill Paugh's Singleton
class Captain {

	private Captain() {
		System.out.println("\tA new captain is elected for your team.");
	}

	// The helper class
	private static class SingletonHelper {
		// This nested class is referenced after
		// when the getCaptain() is called.

		private static final Captain CAPTAIN_INSTANCE = new Captain();
	}

	public static Captain getCaptain() {
		return SingletonHelper.CAPTAIN_INSTANCE;
	}

	public static void dummyMethod() {
		System.out.println("It is a dummy method");
	}

}
