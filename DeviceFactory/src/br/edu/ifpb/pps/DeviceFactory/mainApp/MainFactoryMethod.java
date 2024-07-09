package br.edu.ifpb.pps.DeviceFactory.mainApp;

import br.edu.ifpb.pps.DeviceFactory.device.Device;
import br.edu.ifpb.pps.DeviceFactory.device.DeviceFactory;
import br.edu.ifpb.pps.DeviceFactory.device.SmartphoneFactory;
import br.edu.ifpb.pps.DeviceFactory.device.TabletFactory;

public class MainFactoryMethod {

	public static void main(String[] args) {
		DeviceFactory factory = null;
		Device gadget = null;

		factory = new SmartphoneFactory("5G");
		gadget = factory.assemble(6.1, "14 Pro", "iOS 16");
		System.out.println(gadget);

		System.out.println();
		factory = new TabletFactory("Liquid Retina Display 2388 x 1668 pixels resolution Antireflective");
		gadget = factory.assemble(12.9, "iPad PRO", "iOS 16.7.2");
		System.out.println(gadget);

	}

}
