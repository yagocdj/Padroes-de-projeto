package br.edu.ifpb.pps.DeviceFactory.device;

public abstract class Device {

	private double inches;
	protected String model;
	protected String os;
	private boolean certified = false; // Aprovacao no teste de qualidade

	public Device(double inches, String model) {
		this.inches = inches;
		this.model = model;
	}

	public double getInches() {
		return inches;
	}

	public String getModel() {
		return model;
	}

	public String getOs() {
		return os;
	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + model + " " + inches + " inches " + " OS " + os + ":"
				+ (this.certified == true ? "" : "NOT") + "certified";
	}

	public void attest() {
		this.certified = true;
	}

	public boolean isCertified() {
		return certified;
	}

	public abstract void installOS(String osVersion);

	public abstract void initialize(); // tecnologia wireless móvel

}
