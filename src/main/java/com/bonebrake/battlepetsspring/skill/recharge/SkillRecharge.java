package com.bonebrake.battlepetsspring.skill.recharge;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class SkillRecharge {
	
	private final int rechargeTime;
	private int currentRechargeTime = 0;
	
	public void decrementRechargeTime() {
		
		if (currentRechargeTime > 0) {
			currentRechargeTime--;
		}
	}
	
	public void recharge() {
		currentRechargeTime = rechargeTime;
	}
	
	public boolean isRecharging() {
		return currentRechargeTime > 0;
	}
	
	public void reset() {
		currentRechargeTime = 0;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rechargeTime);
	}
	
	@Override
	public boolean equals(Object obj) {
		return this == obj ||
				obj instanceof SkillRecharge recharge &&
						rechargeTime == recharge.rechargeTime &&
						currentRechargeTime == recharge.currentRechargeTime;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d", currentRechargeTime, rechargeTime);
	}
}
