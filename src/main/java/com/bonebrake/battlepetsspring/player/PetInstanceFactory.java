package com.bonebrake.battlepetsspring.player;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PetInstanceFactory {
	
	private final Map<PetTypes, PetInstance> petInstanceMap;
	
	public PetInstanceFactory(List<PetInstance> petInstanceList) {
		petInstanceMap = new EnumMap<>(PetTypes.class);
		petInstanceList.forEach(petInstance -> petInstanceMap.put(petInstance.getPetType(), petInstance));
	}
	
	public PetInstance getPetInstance(PetTypes petType) {
		return petInstanceMap.get(petType);
	}
	
	@Bean
	public Set<PetInstance> getAllPets() {
		Set<PetInstance> pets = new HashSet<>();
		petInstanceMap.forEach((key, value) -> pets.add(value));
		return pets;
	}
}
