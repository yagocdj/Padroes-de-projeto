package factory;

public class LaptopSimpleFactory {
	
	public static Laptop create(String laptopType) {
		if (laptopType == null )
			return null;

		if (laptopType.equalsIgnoreCase("standard"))
			return new Standard();
		else if (laptopType.equalsIgnoreCase("gaming"))
			return new Gaming();
		else if (laptopType.equalsIgnoreCase("ultrabook"))
			return new Ultrabook();
		else
			return new NullLaptop();
		
	}
}
