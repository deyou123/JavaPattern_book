package jdp3e.abstractfactory;

//Abstract Factory
public abstract class AnimalFactory
{  
  protected abstract Tiger createTiger(String color);
  protected abstract Dog createDog(String color);
}