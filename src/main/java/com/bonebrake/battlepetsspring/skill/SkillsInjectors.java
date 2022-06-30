package com.bonebrake.battlepetsspring.skill;

import com.bonebrake.battlepetsspring.skill.implementations.Skill;
import com.bonebrake.battlepetsspring.skill.instance.SkillInstance;
import com.bonebrake.battlepetsspring.skill.instance.SkillInstanceGeneratorFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class SkillsInjectors {
	
	private final SkillInstanceGeneratorFactory skillInstanceGeneratorFactory;
	private final SkillFactory skillFactory;
	
	@Bean
	public Set<Skills> getSkillsSet() {
		return skillFactory.getSkillMap().keySet().stream().collect(Collectors.toUnmodifiableSet());
	}
	
	@Bean
	public Set<Skill> getSkillCollection() {
		return skillFactory.getSkillMap().values().stream().collect(Collectors.toUnmodifiableSet());
	}
	
	@Bean
	public Set<SkillInstance> getSkillInstanceList() {
		return skillInstanceGeneratorFactory.getAllSkillInstances().values().stream().collect(Collectors.toUnmodifiableSet());
	}
	
	@Bean
	public Map<Skills, Skill> getSkillMap() {
		return skillFactory.getSkillMap();
	}
	
	@Bean
	public Map<Skills, SkillInstance> getAllSkillInstances() {
		return skillInstanceGeneratorFactory.getAllSkillInstances();
	}
}
