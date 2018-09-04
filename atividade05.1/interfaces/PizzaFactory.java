package interfaces;

public interface PizzaFactory  {
	
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}