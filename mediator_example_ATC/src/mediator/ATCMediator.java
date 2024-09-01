package mediator;

public interface ATCMediator {
    public void registerRunway(Runway runway);
    
    public void registerFlight(Flight flight);
 
    public boolean isLandingOk();
 
    public void setLandingStatus(boolean status);
    
}
