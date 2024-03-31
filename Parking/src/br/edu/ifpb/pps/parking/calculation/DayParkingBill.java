package br.edu.ifpb.pps.parking.calculation;

import java.math.BigDecimal;
import java.time.Duration;

public class DayParkingBill implements ParkingBillCalculation {
	
	private static final BigDecimal DAY_VALUE = new BigDecimal(30.0);

	@Override
	public BigDecimal getTotalValue(Duration timePeriod) {
		return DAY_VALUE.multiply(new BigDecimal(timePeriod.toDays()));
	}
}
