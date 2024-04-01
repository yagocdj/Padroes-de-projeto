package br.edu.ifpb.pps.parking.context;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

import br.edu.ifpb.pps.parking.strategy.ParkingBillCalculation;
import br.edu.ifpb.pps.parking.vehicle.Vehicle;

public class Parking {
	
	// REMOVE LATER
	private static final BigDecimal HOUR_VALUE = new BigDecimal(5);
	private static final BigDecimal DAY_VALUE = new BigDecimal(30);
	private static final BigDecimal MONTH_VALUE = new BigDecimal(300);
	
	private LocalDateTime entryTime;
	private LocalDateTime exitTime;
	private Vehicle vehicle;
	private ParkingBillCalculation billCalculation;
	
	public BigDecimal calculateBill() {
		assert (entryTime != null && exitTime != null && vehicle != null);
		return billCalculation.getTotalValue(Duration.between(entryTime, exitTime));
	}
	
	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setBillCalculation(ParkingBillCalculation billCalculation) {
		this.billCalculation = billCalculation;
	}
}
