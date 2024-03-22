package factory;

public class NullLaptop implements Laptop {
	
	@Override
	public void assemble(String model, String cpu, int ram, int hd) {
		System.out.println("Assemble - laptop não existente");
	}
	
	@Override
	public void runTests() {
		System.out.println("Tests - laptop não existente");
	}
	
	@Override
	public boolean isNull() {
		return true;
	}
}
