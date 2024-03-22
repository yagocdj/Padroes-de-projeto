package factory;

public class Ultrabook implements Laptop {

	@Override
	public void runTests() {
		System.out.println("Executando os tetes em um Ultrabook Laptop");

	}

	@Override
	public void assemble(String model, String cpu, int ram, int hd) {
		System.out.println(
				"Montando Laptop " + getClass().getSimpleName() + " model " + model + " " + ram + "GB " + hd + " GB");
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
