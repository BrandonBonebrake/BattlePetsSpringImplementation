package com.bonebrake.battlepetsspring.skill.implementations;

import com.bonebrake.battlepetsspring.skill.SkillTypes;
import com.bonebrake.battlepetsspring.skill.Skills;
import org.springframework.stereotype.Component;

@Component
public class ScissorsPoke extends Skill {
	public ScissorsPoke() {
		super(Skills.SCISSORS_POKE, SkillTypes.CORE, 1);
	}
}
