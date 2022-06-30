package com.bonebrake.battlepetsspring.skill;

import com.bonebrake.battlepetsspring.skill.implementations.Skill;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
public class SkillFactory {
	
	private final Map<Skills, Skill> skillMap = new EnumMap<>(Skills.class);
	
	public SkillFactory(List<Skill> skillList) {
		skillList.forEach(skill -> skillMap.put(skill.getSkillEnum(), skill));
	}
	
	public Skill getSkill(Skills skillsEnum) {
		return skillMap.get(skillsEnum);
	}
}
