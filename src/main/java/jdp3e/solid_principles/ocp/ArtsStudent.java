package jdp3e.solid_principles.ocp;

public class ArtsStudent extends Student{
	public ArtsStudent(String name, String regNumber, double score,String dept) {
		super(name, regNumber, score);
		this.department = dept;
	}
}
