package factory;

public class Standard implements Laptop {

	@Override
	public void assemble(String model, String cpu, int ram, int hd) {
		System.out.println(
				"Montando Laptop " + getClass().getSimpleName() + " model " + model + " " + ram + "GB " + hd + " GB");

	}

	@Override
	public void runTests() {
		System.out.println("Executando os testes em um Normal Laptop");
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
