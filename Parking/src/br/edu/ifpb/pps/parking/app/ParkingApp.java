package br.edu.ifpb.pps.parking.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.ifpb.pps.parking.calculation.HourParkingBill;
import br.edu.ifpb.pps.parking.manager.Parking;
import br.edu.ifpb.pps.parking.vehicle.Vehicle;

public class ParkingApp {

	public static void main(String[] args) {
		// create a parking context
		Parking parking = new Parking();
		
		// set up parking object
		parking.setEntryTime(LocalDateTime.parse(
				"2024-03-31 01:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		parking.setExitTime(LocalDateTime.parse(
				"2024-03-31 02:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		parking.setVehicle(new Vehicle("ABC1D23", "Civic", "Red"));
		
		// set the strategy to be a hour bill calculation
		parking.setBillCalculation(new HourParkingBill());
		
		System.out.println("R$" + parking.calculateBill().doubleValue());
	}

}
