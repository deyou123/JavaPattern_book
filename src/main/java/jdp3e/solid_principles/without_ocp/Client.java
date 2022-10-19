package jdp3e.solid_principles.without_ocp;

import java.util.ArrayList;
import java.util.List;

class Client {

	public static void main(String[] args) {
		System.out.println("*** A demo without OCP.***");
        List<Student> enrolledStudents = enrollStudents();

        // Display all results.
    	System.out.println("===Results:===");            
        for(Student student:enrolledStudents){
        	System.out.println(student);
        }

        
        System.out.println("===Distinctions:==="); 
        DistinctionDecider distinctionDecider = new DistinctionDecider();
        // Evaluate distinctions.          
        for(Student student:enrolledStudents){
            distinctionDecider.evaluateDistinction(student);
        }
	}
	
    private static List<Student> enrollStudents() {
        Student sam = new Student("Sam", "R1", 81.5, "Comp.Sc.");
        Student bob = new Student("Bob", "R2", 72, "Physics");
        Student john = new Student("John", "R3", 71, "History");
        Student kate = new Student("Kate", "R4", 66.5, "English");

        List<Student> students = new ArrayList<Student>();
        students.add(sam);
        students.add(bob);
        students.add(john);
        students.add(kate);
        return students;
    }       
}



