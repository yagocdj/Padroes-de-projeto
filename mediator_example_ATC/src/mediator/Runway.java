package mediator;



/**
 * Componente 2: Runway (representa a pista de pouso)
 * @author alexs
 *
 */
public class Runway implements Command {
    private ATCMediator atcMediator = null;
    
    public Runway(ATCMediator atcMediator)
    {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }
	@Override
	public void land() {
		System.out.println("Landing permission granted.");
		atcMediator.setLandingStatus(true);

	}
	


}
