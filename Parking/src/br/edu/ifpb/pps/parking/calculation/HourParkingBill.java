package br.edu.ifpb.pps.parking.calculation;

import java.math.BigDecimal;
import java.time.Duration;

public class HourParkingBill implements ParkingBillCalculation {
	
	private static final BigDecimal HOUR_VALUE = new BigDecimal(5.0);
	
	@Override
	public BigDecimal getTotalValue(Duration timePeriod) {
		return HOUR_VALUE.multiply(new BigDecimal(timePeriod.toHours()));
	}
}
