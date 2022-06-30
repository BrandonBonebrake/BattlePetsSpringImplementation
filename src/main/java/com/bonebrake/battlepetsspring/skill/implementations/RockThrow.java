package com.bonebrake.battlepetsspring.skill.implementations;

import com.bonebrake.battlepetsspring.skill.SkillTypes;
import com.bonebrake.battlepetsspring.skill.Skills;
import org.springframework.stereotype.Component;

@Component
public class RockThrow extends Skill {
	public RockThrow() {
		super(Skills.ROCK_THROW, SkillTypes.CORE, 1);
	}
}
