package factory;

public interface Laptop {
	public void assemble(String model, String cpu, int ram, int hd);
	public void runTests();
	public boolean isNull();
}
