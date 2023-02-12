package service;

import java.util.*;

public class FloorPlan {
	// Input for the total no of floors
	Scanner sc = new Scanner(System.in);
	PriorityQueue<Integer> floors = new PriorityQueue<>(java.util.Collections.reverseOrder());
	int[] floorSize;
	public int size;
	int highestFloor = 0;

	public void takeInput() {
		try {
			System.out.println("Enter the total no of floors in the building");
			size = sc.nextInt();
			floorSize = new int[size + 1];

			for (int i = 1; i <= size; i++) {
				System.out.println("Enter the floor size given on day : " + i);
				floorSize[i] = sc.nextInt();
				if (highestFloor < floorSize[i])
					highestFloor = floorSize[i];

			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input");

		}

	}

//Method for order of Construction
	public void floorsOrder() {
		int floorBuilt;
		System.out.println("The order of construction is as follows");
		for (int i = 1; i <= size; i++) {
			floors.add(floorSize[i]);
			System.out.println("Day: " + i);
			while (!floors.isEmpty() && (floors.peek() == highestFloor)) {
				floorBuilt = floors.remove();
				System.out.print(floorBuilt + " ");
				highestFloor = findNextHighestFloor(floorBuilt);

			}
			System.out.println();
		}
	}

// Method to find next highest floor
	private int findNextHighestFloor(int floorBuilt) {
		int highest = 0;
		for (int i = 1; i <= size; i++) {
			if ((floorSize[i] > highest) && (floorSize[i] < floorBuilt)) {
				highest = floorSize[i];
			}
		}
		return highest;
	}

}