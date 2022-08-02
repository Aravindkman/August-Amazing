package com.google.msedge.opening;

import org.testng.annotations.Test;

public class test20 {

	@Test(priority = 0)

	public void mountain_tree() {
		// TODO Auto-generated method stub
		System.out.println("mountain tree");
	}

	@Test(priority = 1)
	protected void forest_tree() {
		// TODO Auto-generated method stub
		System.out.println("forest");

	}

	@Test(priority = 2, dependsOnMethods = "forest_tree")
	void plant_root() {
		// TODO Auto-generated method stub
		System.out.println("plants");
	}

	/*public static void main(String[] args) {

		System.out.println("Universe");

		test20 call = new test20();

		call.mountain_tree();

		call.forest_tree();

		call.plant_root();

	}*/

}
