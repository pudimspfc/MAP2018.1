
public class FabricaDePizza {

	private FabricaDePizza() {}  
	// Interfaces.
	private interface Pizza {
		String showInfo();
	}
	private enum Type {
		THICKCRUSTDOUGH, PLUMTOMATOSAUCE,FROZEMCLAMS,MOZZARELACHEESE,MARINASOUCE,ROGLANOCHEESE,FRECLEAMNS;
	}

	private abstract static class PizzaEngredienteFactory {
		abstract Pizza createPizza(Type type); 
	}

	// Implementation.
	private static class PizzaMusarela implements Pizza {
		public String showInfo() { return ""; }
	}
	private static class PizzaBacon implements Pizza {
		public String showInfo() { return ""; }
	}
	private static class PizzaSertaneja implements Pizza {
		public String showInfo() { return ""; }
	}
	private static class PizzaFrango implements Pizza {
		public String showInfo() { return ""; }
	}
	private static class PizzaNy extends PizzaEngredienteFactory {
		Pizza createPizza(Type type) {
			switch (type) {
			case THICKCRUSTDOUGH:
				return new PizzaMusarela();
			case PLUMTOMATOSAUCE:
				return new PizzaFrango();
			case FROZEMCLAMS:
				return new PizzaBacon();
			case MOZZARELACHEESE:
				return new PizzaSertaneja();
			default:
				throw new IllegalArgumentException(); 
			}
		}
	}
	private static class PizzaCalabresa implements Pizza {
		public String showInfo() { return "hb20. Hatch from Fiat"; }
	}
	private static class PizzaFragoncaty implements Pizza {
		public String showInfo() { return "hb20s. Sedan from Fiat"; }
	}
	private static class PizzaCheda implements Pizza {
		public String showInfo() { return "hb20s. Sedan from Fiat"; }
	}
	private static class PizzaIo implements Pizza {
		public String showInfo() { return "hb20s. Sedan from Fiat"; }
	}
	private static class PizzaChicago extends PizzaEngredienteFactory {
		Pizza createPizza(Type type) {
			switch (type) {
			case THICKCRUSTDOUGH:
				return new PizzaCalabresa();
			case MARINASOUCE:
				return new PizzaFragoncaty();
			case ROGLANOCHEESE:
				return new PizzaCheda();
			case FRECLEAMNS:
				return new PizzaIo();
			default:
				throw new IllegalArgumentException(); 
			}
		}
	}

	public static void main(String []args) {
		FabricaDePizza.PizzaEngredienteFactory pizzany = new FabricaDePizza.PizzaNy();
		FabricaDePizza.PizzaEngredienteFactory pizzachicago = new FabricaDePizza.PizzaChicago();
		System.out.println("pizzany factory creates " + PizzaNy.createPizza(Type.THICKCRUSTDOUGH).showInfo());
		System.out.println("pizzany factory creates " + PizzaNy.createPizza(Type.SEDAN).showInfo());
		System.out.println("pizzany factory creates " + PizzaNy.createPizza(Type.HATCH).showInfo());
		System.out.println("pizzany factory creates " + PizzaNy.createPizza(Type.SEDAN).showInfo());

	}
}
