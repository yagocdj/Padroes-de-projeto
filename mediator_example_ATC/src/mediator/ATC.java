package mediator;

public class ATC implements ATCMediator {
    private Flight flight;
    private Runway runway;
    public boolean land;

    
	@Override
	public void registerRunway(Runway runway) {
		this.runway = runway;

	}

	@Override
	public void registerFlight(Flight flight) {
		this.flight = flight;

	}

	@Override
	public boolean isLandingOk() {
		return land;

	}

	@Override
	public void setLandingStatus(boolean status) {
		land = status;
	}
	



}
