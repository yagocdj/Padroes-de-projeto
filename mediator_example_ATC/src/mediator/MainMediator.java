package mediator;

public class MainMediator {

	public static void main(String[] args) {
        ATCMediator atcMediator = new ATC();
        
        //Componente 1
        Flight f1 = new Flight(atcMediator, "LATAM", "LA4542");
        
        //Componente 2
        Runway mainRunway = new Runway(atcMediator);
        
        atcMediator.registerFlight(f1);        
        atcMediator.registerRunway(mainRunway);
        
        
        System.out.println(">> Contato da aeronave 1....");
        f1.getReady();
        System.out.println();
        
        System.out.println(">> Consultando situacao da pista....");
        mainRunway.land();
        System.out.println();
        
        f1.land();

	}

}
