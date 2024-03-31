package br.edu.ifpb.pps.parking.calculation;

import java.math.BigDecimal;
import java.time.Duration;

public class MonthParkingBill implements ParkingBillCalculation {
	
	private static final BigDecimal MONTH_VALUE = new BigDecimal(300.0);

	@Override
	public BigDecimal getTotalValue(Duration timePeriod) {
		return MONTH_VALUE;
	}
}
