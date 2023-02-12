package main;

import service.FloorPlan;

public class Driver {
	public static void main(String[] args) {
		FloorPlan plan = new FloorPlan();
		plan.takeInput();
		if (plan.size > 0) {
			plan.floorsOrder();
		} else {
			System.out.println("No construction order generated as size = " + plan.size);
		}

	}
}
