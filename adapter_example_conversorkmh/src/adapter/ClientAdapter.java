package adapter;

public class ClientAdapter {
    public static void main(String args[]) {
    	Automovel bugattiVeyron = new BugattiVeyron();
    	Adapter conversor = new ConversorKMPH(bugattiVeyron);    	
    	System.out.println("Bugatti Veyron Super Sport's top speed is " + conversor.getSpeed() + " Kmph.");

        Automovel mcLaren = new McLaren();
        conversor.setVehicle( mcLaren );
        System.out.println("McLaren F1 top speed is " + conversor.getSpeed() + " Kmph.");

        Automovel astonMartin = new AstonMartin();
        conversor.setVehicle(astonMartin);
        System.out.println("Aston Martin top speed is " + conversor.getSpeed() + " Kmph.");
        
        // Se quiser em MPH
        System.out.println("Aston Martin top speed is " + astonMartin.getSpeed() + " mph.");
    }
}
