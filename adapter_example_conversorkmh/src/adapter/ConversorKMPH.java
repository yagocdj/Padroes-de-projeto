package adapter;

public class ConversorKMPH implements Adapter{
	//Serviço
    private Automovel luxuryCars;
    
    public ConversorKMPH(Automovel luxuryCars) {
        this.luxuryCars = luxuryCars;
    }
    
    public void setVehicle(Automovel automovel) {
    	this.luxuryCars = automovel;
    }

    @Override
    public double getSpeed() {
        double mph = luxuryCars.getSpeed();
        return convertMPHtoKMPH(mph);
    }
    
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
