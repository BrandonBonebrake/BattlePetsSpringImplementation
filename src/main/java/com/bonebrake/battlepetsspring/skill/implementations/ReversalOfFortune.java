package com.bonebrake.battlepetsspring.skill.implementations;

import com.bonebrake.battlepetsspring.skill.SkillTypes;
import com.bonebrake.battlepetsspring.skill.Skills;
import org.springframework.stereotype.Component;

@Component
public class ReversalOfFortune extends Skill {
	public ReversalOfFortune() {
		super(Skills.REVERSAL_OF_FORTUNE, SkillTypes.SPECIAL, 6);
	}
}
