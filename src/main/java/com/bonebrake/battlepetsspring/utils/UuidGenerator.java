package com.bonebrake.battlepetsspring.utils;

public class UuidGenerator {
	
	private static int uuid = 0;
	
	public static int generateUuidInt() {
		int uuidCurrent = uuid;
		uuid++;
		return uuidCurrent;
	}
}
