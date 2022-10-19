package jdp3e.prototype.implementation_4;


class CopyConstructorDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("***A simple copy constructor demo***\n");
		EmpAddress initialAddress = new EmpAddress("21, abc Road, USA");
		Employee emp = new Employee(1, "John", initialAddress);

		System.out.println("The original object is emp which is as follows:");
		System.out.println(emp);

		System.out.println("\n Copying from emp to empCopy now.");
		Employee empCopy = new Employee(emp);

		System.out.println("The empCopy object is as follows:");
		System.out.println(empCopy);

		System.out.println("\n--Changing the detail of the copied object now.--");
		empCopy.id = 10;
		empCopy.name = "Sam";
		empCopy.empAddress.address = "123, xyz Road, Canada";

		System.out.println("\nNow the emp object is as follows:");
		System.out.println(emp);
		System.out.println("\nAnd the empCopy object is as follows:");
		System.out.println(empCopy);

	}

}
