package com.bonebrake.battlepetsspring.player;

import com.bonebrake.battlepetsspring.observer.Observer;
import com.bonebrake.battlepetsspring.skill.Skills;

import java.util.Set;
import java.util.UUID;

public interface Playable extends Observer
{
	// TODO check if this will work with custom skill sets in the future
	// TODO remove default implementation and tell class about this?
	default Set<Skills> getSkillSet()
	{
		return Set.of(Skills.values());
    }

    int getPlayableUid();

	String getPlayerName();
	String getPetName();
	PlayerTypes getPlayerType();
	PetTypes getPetType();
	double getStartingHp();

	void setCurrentHp(double currentHp);

	double getCurrentHp();
	Skills chooseSkill();
	void resetHp(); // TODO may not need this method in the interface?
	boolean isAwake();
	Skills getSkillPrediction();
	int getSkillRechargeTime(Skills skill);
	double calculateHpPercent(); // Convenience method since this can be calculated from the current / starting hp
	void reset();
	void decrementRechargeTimes();
	void setOnRecharge(Skills skill);
}
