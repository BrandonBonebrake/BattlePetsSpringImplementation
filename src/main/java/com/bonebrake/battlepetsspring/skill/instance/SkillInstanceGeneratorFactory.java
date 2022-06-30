package com.bonebrake.battlepetsspring.skill.instance;

import com.bonebrake.battlepetsspring.skill.Skills;
import com.bonebrake.battlepetsspring.skill.implementations.Skill;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SkillInstanceGeneratorFactory {
	
	private final Map<Skill, SkillInstance> skillInstanceMap = new HashMap<>();
	
	public SkillInstanceGeneratorFactory(List<SkillInstance> skillInstances) {
		skillInstances.forEach(skillInstance -> skillInstanceMap.put(skillInstance.getSkill(), skillInstance));
	}
	
	/**
	 * Generates new SkillInstance object for the Skills enum
	 *
	 * @param skill Skill used to create an instance
	 * @return New skill instance object
	 */
	public SkillInstance getSkillInstance(Skill skill) {
		return new SkillInstance(skillInstanceMap.get(skill));
	}
	
	/**
	 * Obtain a new set of every existing skill instance
	 *
	 * @return Set of all skills available
	 */
	@Bean
	public Map<Skills, SkillInstance> getAllSkillInstances() {
		
		Map<Skills, SkillInstance> instanceMap = new EnumMap<>(Skills.class);
		skillInstanceMap.forEach((key, value) -> instanceMap.put(key.getSkillEnum(), new SkillInstance(value)));
		return instanceMap;
	}
}
