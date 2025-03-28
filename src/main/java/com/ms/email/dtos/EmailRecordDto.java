package com.ms.email.dtos;

import org.hibernate.validator.constraints.UUID;

public record EmailRecordDto(UUID userId, String emailTo,String subject, String text) {
	
}