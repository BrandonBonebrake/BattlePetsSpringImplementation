package com.bonebrake.battlepetsspring.player;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PlayableFactory {
	
	private final Map<PlayerTypes, Playable> petInstanceMap;
	
	public PlayableFactory(List<Playable> petInstanceList) {
		petInstanceMap = new EnumMap<>(PlayerTypes.class);
		petInstanceList.forEach(petInstance -> petInstanceMap.put(petInstance.getPlayerType(), petInstance));
	}
	
	public Playable getPetInstance(PlayerTypes playerTypes) {
		return petInstanceMap.get(playerTypes);
	}
	
	@Bean
	public Set<Playable> getAllPets() {
		Set<Playable> pets = new HashSet<>();
		petInstanceMap.forEach((key, value) -> pets.add(value));
		return pets;
	}
}
