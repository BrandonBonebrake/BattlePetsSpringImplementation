package com.bonebrake.battlepetsspring.skill.instance;

import com.bonebrake.battlepetsspring.skill.implementations.Skill;
import com.bonebrake.battlepetsspring.skill.recharge.SkillRecharge;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaperCutInstance extends SkillInstance {
	
	public PaperCutInstance(@Qualifier("paperCut") Skill skill) {
		super(skill, new SkillRecharge(skill.getRecharge()));
	}
}
