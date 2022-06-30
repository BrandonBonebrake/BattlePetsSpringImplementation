package com.bonebrake.battlepetsspring.skill.implementations;

import com.bonebrake.battlepetsspring.skill.SkillTypes;
import com.bonebrake.battlepetsspring.skill.Skills;
import org.springframework.stereotype.Component;

@Component("paperCut")
public class PaperCut extends Skill {
	
	public PaperCut() {
		super(Skills.PAPER_CUT, SkillTypes.CORE, 1);
	}
}
