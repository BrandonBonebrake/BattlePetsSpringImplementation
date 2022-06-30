package com.bonebrake.battlepetsspring.player;

import com.bonebrake.battlepetsspring.skill.Skills;
import com.bonebrake.battlepetsspring.skill.instance.SkillInstance;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@Getter
@Component
@RequiredArgsConstructor
public abstract class PetInstance implements Playable {
	
	private final Map<Skills, SkillInstance> skillInstances;
	private final UUID playableUid;
	private final String playerName;
	private final String petName;
	private final PlayerTypes playerType;
	private final PetTypes petType;
	private final double startingHp;
	
	private double currentHp;
	
	@Override
	public void reset() {
		skillInstances.forEach((key, skillInstance) -> skillInstance.getRecharge().reset());
		resetHp();
	}
	
	@Override
	public abstract Skills chooseSkill();
	
	@Override
	public abstract Skills getSkillPrediction();
	
	@Override
	public void update(Object event) {
	
	}
	
	@Override
	public final void setCurrentHp(double currentHp) {
		this.currentHp = currentHp;
	}
	
	@Override
	public final void resetHp() {
		currentHp = startingHp;
	}
	
	@Override
	public final boolean isAwake() {
		return currentHp > 0.0;
	}
	
	@Override
	public final int getSkillRechargeTime(Skills skill) {
		return skillInstances.get(skill).getRecharge().getCurrentRechargeTime();
	}
	
	@Override
	public final double calculateHpPercent() {
		return currentHp / startingHp;
	}
	
	@Override
	public final void decrementRechargeTimes() {
		skillInstances.forEach((key, skillInstance) -> skillInstance.getRecharge().decrementRechargeTime());
	}
	
	@Override
	public final void setOnRecharge(Skills skill) {
		skillInstances.get(skill).getRecharge().recharge();
	}
}
