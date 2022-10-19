package jdp3e.template_method.hook_example;

class Client {

	public static void main(String[] args) {
		
		System.out.println("***Template Method Pattern with a hook method.***\n");
		BasicEngineering preferrredCourse = new ComputerScience();
		System.out.println("Computer Science course structure:");
		preferrredCourse.displayCourseStructure();
		System.out.println();
		preferrredCourse = new Electronics();
		System.out.println("Electronics course structure:");
		preferrredCourse.displayCourseStructure();
		
	}

}
