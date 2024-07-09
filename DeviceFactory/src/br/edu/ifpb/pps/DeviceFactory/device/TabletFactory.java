package br.edu.ifpb.pps.DeviceFactory.device;

public class TabletFactory extends DeviceFactory {
	private String screenTechonogy;

	public TabletFactory(String screenTechonogy) {
		this.setScreenTechonogy(screenTechonogy);
	}

	@Override
	protected Device createGadget(double inches, String model) {
		return new Tablet(inches, model, screenTechonogy);
	}

	public String getScreenTechonogy() {
		return screenTechonogy;
	}

	public void setScreenTechonogy(String screenTechonogy) {
		this.screenTechonogy = screenTechonogy;
	}
}