package jdp3e.template_method;

//The concrete derived class: Electronics

class Electronics extends BasicEngineering {
	
	@Override
	public void courseOnSpecialPaper() {
		System.out.println("3. Digital Logic and Circuit Theory");
	}
}
