package jdp3e.solid_principles.without_srp;

import java.util.Random;

class Employee {
    public String firstName, lastName, empId;
    public double experienceInYears;
    public Employee(String firstName, String lastName, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experience;
    }
    public void displayEmpDetail(){
    	System.out.println("The employee name: "+lastName+","+firstName);
    	System.out.println("This employee has "+ experienceInYears+" years of experience.");
    }      

    public String checkSeniority(double experienceInYears){
       return  experienceInYears > 5 ?"senior":"junior";           
    }
    public String generateEmpId(String empFirstName){
        int random = new Random().nextInt(1000);
        empId = empFirstName.substring(0,1)+random;
        return empId;
    }
}

