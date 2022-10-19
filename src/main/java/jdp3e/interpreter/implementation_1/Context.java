package jdp3e.interpreter.implementation_1;

import java.util.ArrayList;
import java.util.List;

class Context {
	private int yearofExperience;
	private List<String> permissibleGrades;

	public Context(int experience, String... allowedGrades) {
		this.yearofExperience = experience;
		this.permissibleGrades = new ArrayList<>();
		for (String grade : allowedGrades) {
			permissibleGrades.add(grade);
		}
	}

	public int getYearofExperience() {
		return yearofExperience;
	}

	public List<String> getPermissibleGrades() {
		return permissibleGrades;
	}
}
