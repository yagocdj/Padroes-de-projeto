package br.edu.ifpb.pps.parking.strategy;

import java.math.BigDecimal;
import java.time.Duration;

public interface ParkingBillCalculation {
	
	BigDecimal getTotalValue(Duration timePeriod);
}
