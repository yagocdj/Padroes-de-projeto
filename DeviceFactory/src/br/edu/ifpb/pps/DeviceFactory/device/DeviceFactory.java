package br.edu.ifpb.pps.DeviceFactory.device;

import java.util.concurrent.TimeUnit;

public abstract class DeviceFactory {

	public Device assemble(double inches, String model, String os) {
		// Metodo gancho
		Device gadget = createGadget(inches, model);
		System.out.println("Assembly step");
		System.out.println("OS " + os);
		gadget.installOS(os);
		gadget.initialize();
		runTest(gadget);
		return gadget;
	}

	public void runTest(Device gadget) {
		System.out.print("Quality control: ");
		for (int i = 1; i < 4; i++) {
			System.out.print("[*] ");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" OK (passed)");
		gadget.attest();

	}

	// Metodo de fabrica
	protected abstract Device createGadget(double inches, String model);
}
