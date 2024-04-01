package br.edu.ifpb.pps.parking.strategy;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class DayParkingBill implements ParkingBillCalculation {
	
	private static final BigDecimal DAY_VALUE = new BigDecimal(30.0);

	@Override
	public BigDecimal getTotalValue(LocalDateTime entryTime, LocalDateTime exitTime) {
		
		long days = Duration.between(entryTime, exitTime).toDays();
		long hours = Duration.between(entryTime, exitTime).toHours();
		
		if (hours > 12 && days <= 1)
			return DAY_VALUE;
		
		return DAY_VALUE.multiply(new BigDecimal(days));
	}
}
