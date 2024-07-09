package br.edu.ifpb.pps.DeviceFactory.device;

public class SmartphoneFactory extends DeviceFactory {
	private String connectivity;

	public SmartphoneFactory(String connectivity) {
		this.setConnectivity(connectivity);
	}

	@Override
	protected Device createGadget(double inches, String model) {
		return new Smartphone(inches, model, connectivity);
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
}
