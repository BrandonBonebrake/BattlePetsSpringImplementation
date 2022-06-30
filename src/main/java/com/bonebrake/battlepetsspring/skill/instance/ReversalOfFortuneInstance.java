package com.bonebrake.battlepetsspring.skill.instance;

import com.bonebrake.battlepetsspring.skill.implementations.Skill;
import com.bonebrake.battlepetsspring.skill.recharge.SkillRecharge;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ReversalOfFortuneInstance extends SkillInstance {
	public ReversalOfFortuneInstance(@Qualifier("reversalOfFortune") Skill skill) {
		super(skill, new SkillRecharge(6));
	}
}
