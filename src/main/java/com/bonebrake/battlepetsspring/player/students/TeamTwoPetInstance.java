package com.bonebrake.battlepetsspring.player.students;

import com.bonebrake.battlepetsspring.player.PetInstance;
import com.bonebrake.battlepetsspring.player.PetTypes;
import com.bonebrake.battlepetsspring.player.PlayerTypes;
import com.bonebrake.battlepetsspring.skill.Skills;
import com.bonebrake.battlepetsspring.skill.instance.SkillInstance;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@Component
public class TeamTwoPetInstance extends PetInstance {
	public TeamTwoPetInstance(Map<Skills, SkillInstance> skillInstances, UUID playableUid) {
		super(skillInstances, playableUid, "Team Dos", "Crumb Covered Pet 2", PlayerTypes.TEAM_TWO, PetTypes.SPEED, 100);
	}
	
	@Override
	public Skills chooseSkill() {
		return null;
	}
	
	@Override
	public Skills getSkillPrediction() {
		return null;
	}
}
