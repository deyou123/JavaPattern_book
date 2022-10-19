package jdp3e.proxy.implementation_2.components;

// ConcreteSubject class
class ConcreteSubject extends Subject
{
	@Override
	public void doSomeWork(String user) 
	{
		System.out.println(user+ " invokes the method-doSomeWork().");
	}
}
