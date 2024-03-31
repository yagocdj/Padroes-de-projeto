package br.edu.ifpb.pps.parking.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.ifpb.pps.parking.context.Parking;
import br.edu.ifpb.pps.parking.strategy.DayParkingBill;
import br.edu.ifpb.pps.parking.strategy.HourParkingBill;
import br.edu.ifpb.pps.parking.strategy.MonthParkingBill;
import br.edu.ifpb.pps.parking.vehicle.Vehicle;

public class ParkingApp {

	public static void main(String[] args) {
		// create a parking context
		Parking parking = new Parking();
		
		// set up parking object
		parking.setEntryTime(LocalDateTime.parse(
				"2024-03-31 01:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		parking.setExitTime(LocalDateTime.parse(
				"2024-03-31 04:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		parking.setVehicle(new Vehicle("ABC1D23", "Civic", "Red"));
		
		// set the strategy to be a hour bill calculation
		parking.setBillCalculation(new HourParkingBill());
		
		System.out.println("R$" + parking.calculateBill().doubleValue());
		
		// change the parking entry time and exit time
		parking.setEntryTime(LocalDateTime.parse(
				"2024-03-30 11:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		parking.setExitTime(LocalDateTime.parse(
				"2024-03-31 12:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		
		// set the strategy to be a day bill calculation
		parking.setBillCalculation(new DayParkingBill());
		
		System.out.println("R$" + parking.calculateBill().doubleValue());
		
		// change the parking entry time and exit time once more
		parking.setEntryTime(LocalDateTime.parse(
				"2024-03-15 11:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		parking.setExitTime(LocalDateTime.parse(
				"2024-03-31 11:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		// set the strategy to be a month bill calculation
		parking.setBillCalculation(new MonthParkingBill());
		
		System.out.println("R$" + parking.calculateBill().doubleValue());
	}

}
