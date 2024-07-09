package br.edu.ifpb.pps.DeviceFactory.device;

public class Smartphone extends Device {

	private String simcard;

	public Smartphone(double inches, String model) {
		super(inches, model);
	}

	public Smartphone(double inches, String model, String simcard) {
		this(inches, model);
		this.simcard = simcard;
	}

	public String getSimcard() {
		return simcard;
	}

	@Override
	public void installOS(String osVersion) {
		this.os = osVersion;
	}

	@Override
	public void initialize() {
		System.out.println("Initializing " + this.getClass().getSimpleName() + " OS " + this.getOs());
		System.out.println("Connecting using simcard " + simcard);
		System.out.println("Completed!!!!");
	}
}
