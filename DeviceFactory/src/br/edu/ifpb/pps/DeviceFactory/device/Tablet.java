package br.edu.ifpb.pps.DeviceFactory.device;

public class Tablet extends Device {
	private String screenTecnology;

	public Tablet(double inches, String model) {
		super(inches, model);
	}

	public Tablet(double inches, String model, String screen) {
		// Liquid Retina Display 2388 x 1668 pixels resolution for iPad PRO
		// Antireflective";
		this(inches, model);
		this.screenTecnology = screen;
	}

	@Override
	public void installOS(String osVersion) {
		this.os = osVersion;
	}

	@Override
	public void initialize() {
		System.out.println("Initializing " + this.getClass().getSimpleName() + " OS " + this.getOs());
		System.out.println("Wait.... starting components.");
		System.out.println("Screen technology: " + screenTecnology);
		System.out.println("Completed!!!!");
	}
}
