package br.edu.ifpb.pps.parking.strategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ParkingBillCalculation {
	
	BigDecimal getTotalValue(LocalDateTime entryTime, LocalDateTime exitTime);
}
