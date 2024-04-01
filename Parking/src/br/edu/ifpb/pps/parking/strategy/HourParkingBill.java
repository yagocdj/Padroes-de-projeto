package br.edu.ifpb.pps.parking.strategy;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class HourParkingBill implements ParkingBillCalculation {
	
	private static final BigDecimal HOUR_VALUE = new BigDecimal(5.0);
	
	@Override
	public BigDecimal getTotalValue(LocalDateTime entryTime, LocalDateTime exitTime) {
		long hours = Duration.between(entryTime, exitTime).toHours();
		if (hours <= 1)
			return HOUR_VALUE;
		
		return HOUR_VALUE.multiply(new BigDecimal(hours));
	}
}
