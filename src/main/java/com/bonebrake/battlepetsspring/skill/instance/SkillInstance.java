package com.bonebrake.battlepetsspring.skill.instance;

import com.bonebrake.battlepetsspring.skill.implementations.Skill;
import com.bonebrake.battlepetsspring.skill.recharge.SkillRecharge;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SkillInstance {
	
	private final Skill skill;
	private final SkillRecharge recharge;
	
	public SkillInstance(SkillInstance instance) {
		skill = instance.skill;
		recharge = instance.recharge;
	}
}
