package com.bonebrake.battlepetsspring.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UuidGenerator {
	
	@Bean
	public UUID generateUuid() {
		return UUID.randomUUID();
	}
}
