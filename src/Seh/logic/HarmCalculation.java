package Seh.logic;

/*
 * 	伤害计算类
 */

public class HarmCalculation {

	// 返回火系对其他系的伤害倍数
	public static float fireG(String type) {

		if (type == "冰系") {
			return (float) 2.0;
		} else if (type == "机械系") {
			return (float) 2.0;
		} else if (type == "草系") {
			return (float) 2.0;
		} else if (type == "水系") {
			return (float) 0.5;
		} else if (type == "圣灵系") {
			return (float) 0.5;
		} else if (type == "火系") {
			return (float) 0.5;
		} else if (type == "自然系") {
			return (float) 0.5;
		} else
			return (float) 1.0;
	}

	// 返回水系对其他系的伤害倍数
	public static float waterG(String type) {

		if (type == "地面系") {
			return (float) 2.0;
		} else if (type == "火系") {
			return (float) 2.0;
		} else if (type == "水系") {
			return (float) 0.5;
		} else if (type == "草系") {
			return (float) 0.5;
		} else if (type == "自然系") {
			return (float) 0.5;
		} else if (type == "圣灵系") {
			return (float) 0.5;
		} else
			return (float) 1.0;
	}

	// 返回草系对其他系的伤害倍数
	public static float grassG(String type) {

		if (type == "地面系") {
			return (float) 2.0;
		} else if (type == "水系") {
			return (float) 2.0;
		} else if (type == "光系") {
			return (float) 2.0;
		} else if (type == "圣灵系") {
			return (float) 0.5;
		} else if (type == "机械系") {
			return (float) 0.5;
		} else if(type == "草系") {
			return (float) 0.5;
		} else if(type == "远古系") {
			return (float) 0.5;
		} else if(type == "飞行系") {
			return (float) 0.5;
		} else if(type == "火系") {
			return (float) 0.5;
		} else
			return (float) 1.0;
	}

	
}
