package br.edu.ifpb.pps.parking.strategy;

import java.math.BigDecimal;
import java.time.Duration;

public class DayParkingBill implements ParkingBillCalculation {
	
	private static final BigDecimal DAY_VALUE = new BigDecimal(30.0);

	@Override
	public BigDecimal getTotalValue(Duration timePeriod) {
		long days = timePeriod.toDays(); 
		if (timePeriod.toHours() > 12 && days <= 1) {
			return DAY_VALUE;
		}
		return DAY_VALUE.multiply(new BigDecimal(days));
	}
}
