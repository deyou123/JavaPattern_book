package jdp3e.solid_principles.without_ocp;

import java.util.Arrays;
import java.util.List;

class DistinctionDecider {

	List<String> science= Arrays.asList("Comp.Sc.","Physics");
	List<String> arts= Arrays.asList("History","English");
	public void evaluateDistinction(Student student) {
		
		if (science.contains(student.department)) {
			if (student.score > 80) {
				System.out.println(student.regNumber+" has received a distinction in science.");
			}
		}

		if (arts.contains(student.department)) {
			if (student.score > 70) {
				System.out.println(student.regNumber+" has received a distinction in arts.");
			}
		}
	}
}
