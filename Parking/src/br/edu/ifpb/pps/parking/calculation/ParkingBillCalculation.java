package br.edu.ifpb.pps.parking.calculation;

import java.math.BigDecimal;
import java.time.Duration;

public interface ParkingBillCalculation {
	
	BigDecimal getTotalValue(Duration timePeriod);
}
