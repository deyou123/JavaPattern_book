package jdp3e.visitor.implementation_2;

class PromotionCheckerVisitor implements Visitor {
	@Override
	public void visitTheElement(SeniorEmployee employee) {
		// We'll promote them if experience is greater than 15 years
		boolean eligibleForPromotion = employee.getExperience() > 15 ? true : false;
		System.out.println("\t\t" + employee.getName() + " is eligible for promotion? " + eligibleForPromotion);
	}

	@Override
	public void visitTheElement(JuniorEmployee employee) {
		// We'll promote them if experience is greater than 5 years
		boolean eligibleForPromotion = employee.getExperience() > 5 ? true : false;
		System.out.println("\t\t" + employee.getName() + " is eligible for promotion? " + eligibleForPromotion);
	}

}
