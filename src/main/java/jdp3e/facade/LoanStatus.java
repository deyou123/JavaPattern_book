package jdp3e.facade;

class LoanStatus {
	public boolean hasPreviousLoans(Person person) {
		System.out.println("Verifying " + person.name + "'s previous loan(s) status.");
		return person.previousLoanExist ? true : false;
	}
}