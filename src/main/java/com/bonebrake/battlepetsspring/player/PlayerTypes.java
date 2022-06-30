package com.bonebrake.battlepetsspring.player;


import com.bonebrake.battlepetsspring.utils.Utils;

public enum PlayerTypes
{
	HUMAN,
	COMPUTER,
	DEFAULT_POWER,
	DEFAULT_SPEED,
	DEFAULT_INTELLIGENCE,
	
	TEAM_ONE,
	TEAM_TWO,
	TEAM_THREE;
	
	@Override
	public String toString()
	{		
		return Utils.convertEnumString(this.name());
	}
}
