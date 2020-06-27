package com.sbxxxia.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FacilityDTO {
	private String facilitySeq, fName, fType, fRegion, fPostalCode, fAddress, fDetailedAddress, fPhoneNumber;
}