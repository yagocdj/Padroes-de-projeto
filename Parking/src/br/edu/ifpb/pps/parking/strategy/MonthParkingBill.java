package br.edu.ifpb.pps.parking.strategy;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MonthParkingBill implements ParkingBillCalculation {
	
	private static final BigDecimal MONTH_VALUE = new BigDecimal(300.0);

	@Override
	public BigDecimal getTotalValue(LocalDateTime entryTime, LocalDateTime exitTime) {
		
		long days = Duration.between(entryTime, exitTime).toDays();
		long monthsBetween = ChronoUnit.MONTHS.between(entryTime, exitTime);
		
		if (days > 15 && monthsBetween <= 1)
			return MONTH_VALUE;
		
		return MONTH_VALUE.multiply(new BigDecimal(monthsBetween));
	}
}
