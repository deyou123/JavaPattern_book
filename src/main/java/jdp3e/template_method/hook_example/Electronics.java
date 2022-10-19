package jdp3e.template_method.hook_example;

// The concrete derived class: Electronics

class Electronics extends BasicEngineering {

	@Override
	public void courseOnSpecialPaper() {
		System.out.println("3. Digital Logic and Circuit Theory");
	}
	/*
	 * Overriding the hook method. 
	 * The additional paper is not needed 
	 * for the Electronics students.
	 */

	@Override
	boolean isAdditionalPaperNeeded() {
		return false;
	}

}
