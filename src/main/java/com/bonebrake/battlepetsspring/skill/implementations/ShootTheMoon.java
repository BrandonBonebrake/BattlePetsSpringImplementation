package com.bonebrake.battlepetsspring.skill.implementations;

import com.bonebrake.battlepetsspring.skill.SkillTypes;
import com.bonebrake.battlepetsspring.skill.Skills;
import org.springframework.stereotype.Component;

@Component
public class ShootTheMoon extends Skill {
	public ShootTheMoon() {
		super(Skills.SHOOT_THE_MOON, SkillTypes.SPECIAL, 6);
	}
}
