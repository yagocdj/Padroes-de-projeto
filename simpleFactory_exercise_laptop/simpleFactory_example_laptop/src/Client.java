import factory.Laptop;
import factory.LaptopSimpleFactory;

public class Client {

	public static void main(String[] args) {
		
		Laptop myLaptop = LaptopSimpleFactory.create("gaming");		
		myLaptop.assemble("16T-S000", "AMD Ryzen™ 5 7640HS", 16, 1000);
		myLaptop.runTests();
		
		myLaptop = LaptopSimpleFactory.create("standard");
		myLaptop.assemble("HP 256 G9", "Intel Core i5-1215U", 8, 256);
		myLaptop.runTests();
		
		myLaptop = LaptopSimpleFactory.create("ultrabook");
		myLaptop.assemble("14-b085br", "Intel Core i5-3317U", 8, 750);
		myLaptop.runTests();
		
		myLaptop = LaptopSimpleFactory.create("chromebook");
		myLaptop.assemble("XE310XBA-KT4BR", "Intel Celeron N4020", 4, 64);
		myLaptop.runTests();

	}

}
