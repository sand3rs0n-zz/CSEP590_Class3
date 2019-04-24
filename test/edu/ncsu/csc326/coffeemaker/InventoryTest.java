package edu.ncsu.csc326.coffeemaker;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ncsu.csc326.coffeemaker.Inventory;

public class InventoryTest {
	
	@Test
	public void testDefaults() {
		Inventory inventory = new Inventory();
		int chocUnits = inventory.getChocolate();
		assertEquals(15, chocUnits);
	}

	//test gets
	@Test
	public void testGetSugar() {
		Inventory inventory = new Inventory();
		assertEquals(15, inventory.getSugar());
	}

	@Test
	public void testGetMilk() {
		Inventory inventory = new Inventory();
		assertEquals(15, inventory.getMilk());
	}

	@Test
	public void testGetCoffee() {
		Inventory inventory = new Inventory();
		assertEquals(15, inventory.getCoffee());
	}

	@Test
	public void testGetChocolate() {
		Inventory inventory = new Inventory();
		assertEquals(15, inventory.getChocolate());
	}

	//test sets
	@Test
	public void testSetSugar() {
		Inventory inventory = new Inventory();
		inventory.setSugar(12);
		assertEquals(12, inventory.getSugar());
	}

	@Test
	public void testSetMilk() {
		Inventory inventory = new Inventory();
		inventory.setMilk(12);
		assertEquals(12, inventory.getMilk());
	}

	@Test
	public void testSetCoffee() {
		Inventory inventory = new Inventory();
		inventory.setCoffee(12);
		assertEquals(12, inventory.getCoffee());
	}

	@Test
	public void testSetChocolate() {
		Inventory inventory = new Inventory();
		inventory.setChocolate(12);
		assertEquals(12, inventory.getChocolate());
	}

	//test adds
	@Test
	public void testAddSugar() throws Exception {
		Inventory inventory = new Inventory();
		try {
			// This is a bug. It does <= 0 instead of >= 0, causing this line to throw an exception.
			inventory.addSugar("2");
		} catch (Exception e) {
			throw e;
		}
		assertEquals(17, inventory.getSugar());
	}

	@Test
	public void testAddMilk() throws Exception {
		Inventory inventory = new Inventory();
		try {
			inventory.addMilk("2");
		} catch (Exception e){
			throw e;
		}
		assertEquals(17, inventory.getMilk());
	}

	@Test
	public void testAddCoffee() throws Exception {
		Inventory inventory = new Inventory();
		try {
			inventory.addCoffee("2");
		} catch (Exception e) {
			throw e;
		}
		assertEquals(17, inventory.getCoffee());
	}

	@Test
	public void testAddChocolate() throws Exception {
		Inventory inventory = new Inventory();
		try {
			inventory.addChocolate("2");
		} catch (Exception e) {
			throw e;
		}
		assertEquals(17, inventory.getChocolate());
	}

	//enoughIngredients
	@Test
	public void testEnoughIngredientsPasses() throws Exception {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("2");
			recipe.setAmtCoffee("2");
			recipe.setAmtMilk("2");
			recipe.setAmtSugar("2");
		} catch (Exception e) {
			throw e;
		}

		Inventory inventory = new Inventory();
		boolean result = inventory.enoughIngredients(recipe);
		assertTrue(result);
	}

	@Test
	public void testEnoughIngredientsFailsOnNotEnoughChocolate() throws Exception {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("20");
			recipe.setAmtCoffee("2");
			recipe.setAmtMilk("2");
			recipe.setAmtSugar("2");
		} catch (Exception e) {
			throw e;
		}

		Inventory inventory = new Inventory();
		boolean result = inventory.enoughIngredients(recipe);
		assertFalse(result);
	}

	@Test
	public void testEnoughIngredientsFailsOnNotEnoughCoffee() throws Exception {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("2");
			recipe.setAmtCoffee("20");
			recipe.setAmtMilk("2");
			recipe.setAmtSugar("2");
		} catch (Exception e) {
			throw e;
		}

		Inventory inventory = new Inventory();
		boolean result = inventory.enoughIngredients(recipe);
		assertFalse(result);
	}

	@Test
	public void testEnoughIngredientsFailsOnNotEnoughMilk() throws Exception {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("2");
			recipe.setAmtCoffee("2");
			recipe.setAmtMilk("20");
			recipe.setAmtSugar("2");
		} catch (Exception e) {
			throw e;
		}

		Inventory inventory = new Inventory();
		boolean result = inventory.enoughIngredients(recipe);
		assertFalse(result);
	}

	@Test
	public void testEnoughIngredientsFailsOnNotEnoughSugar() throws Exception {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("2");
			recipe.setAmtCoffee("2");
			recipe.setAmtMilk("2");
			recipe.setAmtSugar("20");
		} catch (Exception e) {
			throw e;
		}

		Inventory inventory = new Inventory();
		boolean result = inventory.enoughIngredients(recipe);
		assertFalse(result);
	}

	//useIngredients
	@Test
	public void testUseIngredientsPasses() throws Exception {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("2");
			recipe.setAmtCoffee("2");
			recipe.setAmtMilk("2");
			recipe.setAmtSugar("2");
		} catch (Exception e) {
			throw e;
		}

		Inventory inventory = new Inventory();
		boolean result = inventory.useIngredients(recipe);
		assertTrue(result);
		assertEquals(13, inventory.getChocolate());
		assertEquals(13, inventory.getMilk());
		assertEquals(13, inventory.getSugar());
		assertEquals(13, inventory.getCoffee());
	}


	@Test
	public void testUseIngredientsFailsWhenNotEnoughIngredients() throws Exception {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("20");
			recipe.setAmtCoffee("2");
			recipe.setAmtMilk("2");
			recipe.setAmtSugar("2");
		} catch (Exception e) {
			throw e;
		}

		Inventory inventory = new Inventory();
		boolean result = inventory.useIngredients(recipe);
		assertFalse(result);
	}
}