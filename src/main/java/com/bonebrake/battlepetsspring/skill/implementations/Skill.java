package com.bonebrake.battlepetsspring.skill.implementations;

import com.bonebrake.battlepetsspring.skill.SkillTypes;
import com.bonebrake.battlepetsspring.skill.Skills;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public abstract class Skill {

	private final Skills skillEnum;
	private final SkillTypes skillTypeEnum;
	private final int recharge;
	
	public Skill(Skill other) {
		skillEnum = other.skillEnum;
		skillTypeEnum = other.skillTypeEnum;
		recharge = other.recharge;
	}
	
	public String getSkillName() {
		return toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(skillEnum, recharge, skillTypeEnum);
	}
	
	@Override
	public boolean equals(Object obj) {
		return this == obj || obj instanceof Skill skill && equals(skill);
	}
	
	public boolean equals(Skill skill) {
		return skillEnum.equals(skill.skillEnum) &&
				skillTypeEnum.equals(skill.skillTypeEnum) &&
				recharge == skill.recharge;
	}
	
	@Override
	public String toString() {
		return skillEnum.toString();
	}
}
