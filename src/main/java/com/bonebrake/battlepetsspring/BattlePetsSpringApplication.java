package com.bonebrake.battlepetsspring;

import com.bonebrake.battlepetsspring.player.Playable;
import com.bonebrake.battlepetsspring.player.PlayableFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class BattlePetsSpringApplication {
	
	private final PlayableFactory playableFactory;
	
	public BattlePetsSpringApplication(PlayableFactory playableFactory) {
		this.playableFactory = playableFactory;
		
		Set<Playable> playableSet = playableFactory.getAllPets();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BattlePetsSpringApplication.class, args);
	}
}
