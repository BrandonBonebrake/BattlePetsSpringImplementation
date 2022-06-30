package com.bonebrake.battlepetsspring.player.students;

import com.bonebrake.battlepetsspring.player.PetInstance;
import com.bonebrake.battlepetsspring.player.PetTypes;
import com.bonebrake.battlepetsspring.player.PlayerTypes;
import com.bonebrake.battlepetsspring.skill.Skills;
import com.bonebrake.battlepetsspring.skill.instance.SkillInstance;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TeamOnePetInstance extends PetInstance {
	public TeamOnePetInstance(Map<Skills, SkillInstance> skillInstances) {
		super(skillInstances,"Team Uno", "Super Pet 1", PlayerTypes.TEAM_ONE, PetTypes.POWER, 100);
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
