package factory;

public class Gaming implements Laptop {

	@Override
	public void assemble(String model, String cpu, int ram, int hd) {
		System.out.println(
				"Montando Laptop " + getClass().getSimpleName() + " model " + model + " " + ram + "GB " + hd + " GB");

	}

	@Override
	public void runTests() {
		System.out.println("Executando os tetes em um Gaming Laptop");
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
