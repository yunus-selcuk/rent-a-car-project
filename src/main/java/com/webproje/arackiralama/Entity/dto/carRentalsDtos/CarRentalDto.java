package com.webproje.arackiralama.Entity.dto.carRentalsDtos;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarRentalDto {

	private int rentalPeriod;
	
	private Date rentalDate;
	
	private int companyId;

	private int vehicleId;
	
}
