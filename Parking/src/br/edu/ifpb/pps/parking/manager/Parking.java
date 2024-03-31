package br.edu.ifpb.pps.parking.manager;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

import br.edu.ifpb.pps.parking.calculation.ParkingBillCalculation;
import br.edu.ifpb.pps.parking.vehicle.Vehicle;

public class Parking {
	
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
