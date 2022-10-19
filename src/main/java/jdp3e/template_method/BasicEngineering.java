package jdp3e.template_method;

abstract class BasicEngineering {
	
	// The "Template Method"
	// Making the method final to prevent overriding.
	
	public final void displayCourseStructure() {
		/*
		 * The course needs to be completed 
		 * in the following sequence: 
		 * 1.Mathematics
		 * 2.Soft skills 
		 * 3.Subclass-specific paper
		 */

		// Common Papers:
		courseOnMathematics(); //Step-1
		courseOnSoftSkills(); //Step-2

		// Course-specific Paper:
		courseOnSpecialPaper(); //Step-3
	}

	private void courseOnMathematics() {
		System.out.println("1. Mathematics");
	}
 
	private void courseOnSoftSkills() {
		System.out.println("2. Soft skills");
	}

	/*
	 * The following method will vary. 
	 * It will be overridden by the 
	 * derived classes.
	 */

	public abstract void courseOnSpecialPaper();
}