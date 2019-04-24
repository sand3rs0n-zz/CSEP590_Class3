/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 24 04:48:13 GMT 2019
 */

package edu.ncsu.csc326.coffeemaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.ncsu.csc326.coffeemaker.Inventory;
import edu.ncsu.csc326.coffeemaker.Recipe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Inventory_ESTest extends Inventory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      Recipe recipe0 = new Recipe();
      recipe0.setAmtChocolate("8");
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertEquals(7, inventory0.getChocolate());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      Recipe recipe0 = new Recipe();
      recipe0.setAmtMilk("8");
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertEquals(7, inventory0.getMilk());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      Recipe recipe0 = new Recipe();
      recipe0.setAmtCoffee("8");
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertEquals(23, inventory0.getCoffee());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getChocolate());
      
      inventory0.setChocolate(0);
      Recipe recipe0 = new Recipe();
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertEquals(0, inventory0.getChocolate());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getSugar());
      
      Recipe recipe0 = new Recipe();
      inventory0.setSugar(0);
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertEquals(0, inventory0.getSugar());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getMilk());
      
      Recipe recipe0 = new Recipe();
      inventory0.setMilk(0);
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertEquals(0, inventory0.getMilk());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getCoffee());
      
      Recipe recipe0 = new Recipe();
      inventory0.setCoffee(0);
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertEquals(0, inventory0.getCoffee());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.addMilk("4");
      assertEquals(19, inventory0.getMilk());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.addCoffee("4");
      assertEquals(19, inventory0.getCoffee());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.addChocolate("4");
      assertEquals(19, inventory0.getChocolate());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      try { 
        inventory0.addSugar(";r(0HrPM$Xnx&+hi");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Units of sugar must be a positive integer
         //
         verifyException("edu.ncsu.csc326.coffeemaker.Inventory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getMilk());
      
      inventory0.setMilk(0);
      int int0 = inventory0.getMilk();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getCoffee());
      
      inventory0.setCoffee(0);
      int int0 = inventory0.getCoffee();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getChocolate());
      
      inventory0.setChocolate(0);
      int int0 = inventory0.getChocolate();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      Recipe recipe0 = new Recipe();
      boolean boolean0 = inventory0.enoughIngredients(recipe0);
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, inventory0.getCoffee());
      assertEquals(15, inventory0.getMilk());
      assertTrue(boolean0);
      assertEquals(15, inventory0.getChocolate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      // Undeclared exception!
      try { 
        inventory0.useIngredients((Recipe) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.ncsu.csc326.coffeemaker.Inventory", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      // Undeclared exception!
      try { 
        inventory0.enoughIngredients((Recipe) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.ncsu.csc326.coffeemaker.Inventory", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      try { 
        inventory0.addMilk("Units of sugar must be a positive integer");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Units of milk must be a positive integer
         //
         verifyException("edu.ncsu.csc326.coffeemaker.Inventory", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      try { 
        inventory0.addCoffee("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Units of coffee must be a positive integer
         //
         verifyException("edu.ncsu.csc326.coffeemaker.Inventory", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      try { 
        inventory0.addChocolate(";r(0HrPM$Xnx&+hi");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Units of chocolate must be a positive integer
         //
         verifyException("edu.ncsu.csc326.coffeemaker.Inventory", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getSugar());
      
      inventory0.setSugar(0);
      int int0 = inventory0.getSugar();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      int int0 = inventory0.getChocolate();
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, int0);
      assertEquals(15, inventory0.getCoffee());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      int int0 = inventory0.getCoffee();
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, int0);
      assertEquals(15, inventory0.getChocolate());
      assertEquals(15, inventory0.getMilk());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      int int0 = inventory0.getMilk();
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, int0);
      assertEquals(15, inventory0.getCoffee());
      assertEquals(15, inventory0.getChocolate());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      int int0 = inventory0.getSugar();
      assertEquals(15, inventory0.getCoffee());
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, int0);
      assertEquals(15, inventory0.getChocolate());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getChocolate());
      
      inventory0.setChocolate(0);
      Recipe recipe0 = new Recipe();
      recipe0.setAmtChocolate("8");
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      Recipe recipe0 = new Recipe();
      recipe0.setAmtSugar("8");
      inventory0.useIngredients(recipe0);
      boolean boolean0 = inventory0.enoughIngredients(recipe0);
      assertEquals(7, inventory0.getSugar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getMilk());
      
      Recipe recipe0 = new Recipe();
      inventory0.setMilk(0);
      recipe0.setAmtMilk("8");
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      assertEquals(15, inventory0.getCoffee());
      
      Recipe recipe0 = new Recipe();
      recipe0.setAmtCoffee("8");
      inventory0.setCoffee(0);
      boolean boolean0 = inventory0.useIngredients(recipe0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.addSugar("0");
      assertEquals(15, inventory0.getCoffee());
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getChocolate());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      try { 
        inventory0.addSugar("4");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Units of sugar must be a positive integer
         //
         verifyException("edu.ncsu.csc326.coffeemaker.Inventory", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.setSugar((-1534));
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getChocolate());
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, inventory0.getCoffee());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.addMilk("0");
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, inventory0.getCoffee());
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getChocolate());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.setMilk((-1534));
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getChocolate());
      assertEquals(15, inventory0.getCoffee());
      assertEquals(15, inventory0.getSugar());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.addCoffee("0");
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, inventory0.getChocolate());
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getCoffee());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.setCoffee((-1311));
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getCoffee());
      assertEquals(15, inventory0.getChocolate());
      assertEquals(15, inventory0.getSugar());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.addChocolate("0");
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getCoffee());
      assertEquals(15, inventory0.getChocolate());
      assertEquals(15, inventory0.getSugar());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      inventory0.setChocolate((-4109));
      assertEquals(15, inventory0.getSugar());
      assertEquals(15, inventory0.getChocolate());
      assertEquals(15, inventory0.getMilk());
      assertEquals(15, inventory0.getCoffee());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Inventory inventory0 = new Inventory();
      String string0 = inventory0.toString();
      assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", string0);
  }
}
