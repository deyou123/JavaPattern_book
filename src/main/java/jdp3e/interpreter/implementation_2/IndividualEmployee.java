package jdp3e.interpreter.implementation_2;

class IndividualEmployee implements Employee {
	private int experience;

	private String grade;

	public IndividualEmployee(int experience, String grade) {
		this.experience = experience;
		this.grade = grade;
	}

	@Override
	public boolean interpret(Context context) {

		if (experience >= context.getYearofExperience() && context.getPermissibleGrades().contains(grade)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Expreience: " + experience + ", grade: " + grade;
	}
}
