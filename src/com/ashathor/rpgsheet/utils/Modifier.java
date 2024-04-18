package com.ashathor.rpgsheet.utils;

public class Modifier {

	public static int calc(int stat) {
		return Math.floorDiv((stat-10), 2);
	}

}
