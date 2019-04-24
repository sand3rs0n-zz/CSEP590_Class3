import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        int int10 = inventory0.getMilk();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        inventory0.setChocolate((int) (byte) 10);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        inventory0.setMilk(15);
        inventory0.setChocolate(100);
        inventory0.setChocolate(97);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setSugar(0);
        inventory0.setSugar(0);
        int int11 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        int int15 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setSugar(32);
        inventory0.setMilk((int) 'a');
        java.lang.String str13 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 97\nSugar: 32\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 97\nSugar: 32\nChocolate: 15\n"));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getMilk();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        inventory0.setChocolate(100);
        java.lang.String str10 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 100\n" + "'", str10.equals("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 100\n"));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setMilk(52);
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        int int12 = inventory0.getMilk();
        inventory0.setChocolate((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addCoffee("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        inventory0.setMilk(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        int int5 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        try {
            inventory0.addMilk("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        int int9 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        inventory0.setChocolate((int) (byte) 10);
        int int17 = inventory0.getMilk();
        inventory0.setSugar((int) (byte) -1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe20 = null;
        try {
            boolean boolean21 = inventory0.useIngredients(recipe20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str8.equals("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        try {
            inventory0.addCoffee("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        try {
            inventory0.addSugar("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        int int19 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass20 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (byte) 10);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getCoffee();
        int int13 = inventory0.getCoffee();
        int int14 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.String str6 = inventory0.toString();
        inventory0.setChocolate((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        inventory0.setSugar(1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        int int13 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setSugar((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        int int5 = inventory0.getMilk();
        int int6 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) 'a');
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str13.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        int int5 = inventory0.getSugar();
        inventory0.setSugar(0);
        inventory0.setSugar((int) (byte) -1);
        int int10 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        inventory0.setChocolate(32);
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        int int20 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((-1));
        int int13 = inventory0.getCoffee();
        inventory0.setMilk((int) (byte) 1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setChocolate(0);
        inventory0.setCoffee((int) (byte) -1);
        inventory0.setMilk((int) (short) 10);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        java.lang.String str10 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setSugar(1);
        java.lang.String str8 = inventory0.toString();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setChocolate(0);
        inventory0.setChocolate((-1));
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        inventory0.setCoffee((int) (byte) 10);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        try {
            inventory0.addChocolate("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getMilk();
        inventory0.setChocolate(0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        inventory0.setMilk((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setMilk(52);
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        inventory0.setChocolate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setMilk((int) (byte) -1);
        inventory0.setCoffee(0);
        try {
            inventory0.addCoffee("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar(15);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getCoffee();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setSugar(100);
        int int14 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) 'a');
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str8.equals("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setChocolate(15);
        inventory0.setMilk((int) 'a');
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        int int8 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((-1));
        int int15 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getMilk();
        java.lang.String str18 = inventory0.toString();
        int int19 = inventory0.getSugar();
        inventory0.setChocolate(35);
        int int22 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str18.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar((int) '4');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getChocolate();
        int int2 = inventory0.getSugar();
        int int3 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe8 = null;
        try {
            boolean boolean9 = inventory0.useIngredients(recipe8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((-1));
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.String str11 = inventory0.toString();
        java.lang.String str12 = inventory0.toString();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str11.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str12.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 0);
        inventory0.setSugar((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        inventory0.setMilk(10);
        int int22 = inventory0.getMilk();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setMilk((int) '4');
        inventory0.setChocolate(100);
        edu.ncsu.csc326.coffeemaker.Recipe recipe12 = null;
        try {
            boolean boolean13 = inventory0.useIngredients(recipe12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getMilk();
        edu.ncsu.csc326.coffeemaker.Recipe recipe17 = null;
        try {
            boolean boolean18 = inventory0.useIngredients(recipe17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getChocolate();
        inventory0.setSugar((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        inventory0.setChocolate((int) (byte) 10);
        edu.ncsu.csc326.coffeemaker.Recipe recipe17 = null;
        try {
            boolean boolean18 = inventory0.useIngredients(recipe17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setSugar(32);
        inventory0.setMilk((int) 'a');
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        inventory0.setMilk(15);
        int int16 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        java.lang.String str12 = inventory0.toString();
        inventory0.setChocolate((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setMilk(52);
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) -1);
        int int8 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        inventory0.setChocolate((int) 'a');
        int int18 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe19 = null;
        try {
            boolean boolean20 = inventory0.useIngredients(recipe19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getChocolate();
        inventory0.setSugar(100);
        inventory0.setCoffee((int) '#');
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        int int15 = inventory0.getMilk();
        inventory0.setCoffee(10);
        java.lang.String str18 = inventory0.toString();
        int int19 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe12 = null;
        try {
            boolean boolean13 = inventory0.useIngredients(recipe12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((-1));
        inventory0.setMilk((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        java.lang.String str12 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n"));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        int int10 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        inventory0.setChocolate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        java.lang.String str10 = inventory0.toString();
        inventory0.setSugar(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getMilk();
        int int17 = inventory0.getChocolate();
        inventory0.setSugar(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getMilk();
        inventory0.setCoffee(0);
        int int21 = inventory0.getChocolate();
        java.lang.String str22 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str22.equals("Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getSugar();
        inventory0.setMilk((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        int int10 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        java.lang.String str10 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 1\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 1\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        int int8 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        int int8 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setCoffee(100);
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        int int18 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        try {
            inventory0.addSugar("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        java.lang.String str8 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setCoffee(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        inventory0.setMilk((int) '#');
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        int int6 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setCoffee((int) (byte) -1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        inventory0.setMilk((int) '4');
        inventory0.setCoffee(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setMilk((int) 'a');
        int int14 = inventory0.getChocolate();
        int int15 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        java.lang.String str10 = inventory0.toString();
        inventory0.setChocolate((-1));
        int int13 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        int int14 = inventory0.getCoffee();
        inventory0.setMilk(100);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        inventory0.setMilk(15);
        int int16 = inventory0.getSugar();
        inventory0.setSugar(32);
        inventory0.setCoffee((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getSugar();
        inventory0.setSugar(32);
        java.lang.String str14 = inventory0.toString();
        inventory0.setSugar((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n" + "'", str14.equals("Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n"));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getSugar();
        int int2 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        int int16 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setChocolate(0);
        inventory0.setMilk(10);
        inventory0.setChocolate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getChocolate();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((-1));
        edu.ncsu.csc326.coffeemaker.Recipe recipe13 = null;
        try {
            boolean boolean14 = inventory0.useIngredients(recipe13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) 'a');
        java.lang.String str8 = inventory0.toString();
        inventory0.setCoffee(52);
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str8.equals("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getChocolate();
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) 'a');
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        int int12 = inventory0.getMilk();
        inventory0.setCoffee((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        int int11 = inventory0.getChocolate();
        int int12 = inventory0.getSugar();
        inventory0.setSugar((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk(1);
        inventory0.setChocolate((int) '4');
        int int7 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        inventory0.setMilk((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(10);
        int int14 = inventory0.getSugar();
        inventory0.setSugar(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        int int15 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) 'a');
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        int int15 = inventory0.getMilk();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        inventory0.setMilk(15);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        inventory0.setChocolate(100);
        inventory0.setChocolate(0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar(15);
        int int10 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        int int7 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe3 = null;
        try {
            boolean boolean4 = inventory0.useIngredients(recipe3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setMilk(52);
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        inventory0.setChocolate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar(0);
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        int int18 = inventory0.getCoffee();
        java.lang.String str19 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str19.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getChocolate();
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 100);
        java.lang.String str16 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n"));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getChocolate();
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) (short) 100);
        int int7 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        int int12 = inventory0.getMilk();
        java.lang.String str13 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 0\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 100\nSugar: 0\nChocolate: 15\n"));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getSugar();
        inventory0.setSugar(32);
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        int int12 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        try {
            inventory0.addCoffee("Coffee: 1\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        java.lang.String str2 = inventory0.toString();
        inventory0.setSugar(10);
        int int5 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str2.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass16 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        int int15 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 1);
        inventory0.setMilk((int) ' ');
        java.lang.String str20 = inventory0.toString();
        java.lang.String str21 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n" + "'", str20.equals("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n" + "'", str21.equals("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        int int9 = inventory0.getSugar();
        inventory0.setCoffee(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((-1));
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        java.lang.String str14 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str14.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        int int10 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 97\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getMilk();
        inventory0.setChocolate(32);
        int int15 = inventory0.getCoffee();
        inventory0.setChocolate((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        int int7 = inventory0.getSugar();
        int int8 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setCoffee((int) (short) 1);
        int int10 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        inventory0.setChocolate((int) (byte) 100);
        inventory0.setSugar(15);
        inventory0.setMilk(15);
        int int16 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        inventory0.setMilk((int) '4');
        inventory0.setCoffee(1);
        try {
            inventory0.addCoffee("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setMilk(1);
        inventory0.setCoffee(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        int int5 = inventory0.getSugar();
        inventory0.setSugar(0);
        inventory0.setSugar((int) (byte) -1);
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setMilk((int) (short) 100);
        java.lang.String str10 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getSugar();
        inventory0.setMilk(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        inventory0.setSugar(100);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe2 = null;
        try {
            boolean boolean3 = inventory0.useIngredients(recipe2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setSugar(0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getChocolate();
        inventory0.setMilk((int) ' ');
        inventory0.setMilk((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe12 = null;
        try {
            boolean boolean13 = inventory0.useIngredients(recipe12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        inventory0.setMilk(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getSugar();
        java.lang.String str2 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str2.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        inventory0.setMilk(15);
        int int16 = inventory0.getChocolate();
        inventory0.setCoffee(10);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setMilk(10);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        int int6 = inventory0.getCoffee();
        int int7 = inventory0.getMilk();
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 97\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee(15);
        int int6 = inventory0.getMilk();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setMilk((int) '4');
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        inventory0.setCoffee((int) (byte) 10);
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setMilk(1);
        int int4 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        int int20 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar((int) '4');
        inventory0.setCoffee((int) (short) 100);
        int int12 = inventory0.getSugar();
        java.lang.String str13 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 15\n" + "'", str13.equals("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 15\n"));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getCoffee();
        inventory0.setMilk((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        inventory0.setMilk(15);
        inventory0.setChocolate(100);
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar((int) '4');
        inventory0.setCoffee((int) (short) 100);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getChocolate();
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n" + "'", str11.equals("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar((int) '4');
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar(0);
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        inventory0.setCoffee((int) ' ');
        int int16 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        int int5 = inventory0.getSugar();
        inventory0.setMilk(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        java.lang.String str9 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        inventory0.setChocolate((int) (byte) 100);
        inventory0.setSugar(15);
        int int14 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        java.lang.String str10 = inventory0.toString();
        inventory0.setSugar(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe13 = null;
        try {
            boolean boolean14 = inventory0.useIngredients(recipe13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int12 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        int int19 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe20 = null;
        try {
            boolean boolean21 = inventory0.useIngredients(recipe20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getCoffee();
        int int6 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setSugar(0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        int int14 = inventory0.getMilk();
        inventory0.setSugar((int) '#');
        try {
            inventory0.addChocolate("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        int int13 = inventory0.getCoffee();
        inventory0.setSugar((int) 'a');
        java.lang.String str16 = inventory0.toString();
        inventory0.setSugar((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 97\nChocolate: 1\n" + "'", str16.equals("Coffee: 0\nMilk: 15\nSugar: 97\nChocolate: 1\n"));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        inventory0.setChocolate(1);
        inventory0.setCoffee((int) (byte) 10);
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setCoffee((int) (short) 1);
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        inventory0.setChocolate((int) '4');
        inventory0.setSugar((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setSugar(0);
        inventory0.setSugar(0);
        int int11 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getMilk();
        java.lang.String str18 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 97\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str18.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        java.lang.String str16 = inventory0.toString();
        inventory0.setMilk((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        java.lang.Class<?> wildcardClass20 = inventory0.getClass();
        java.lang.Class<?> wildcardClass21 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        edu.ncsu.csc326.coffeemaker.Recipe recipe8 = null;
        try {
            boolean boolean9 = inventory0.useIngredients(recipe8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        java.lang.Class<?> wildcardClass1 = inventory0.getClass();
        inventory0.setMilk(97);
        int int4 = inventory0.getMilk();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        inventory0.setMilk(15);
        int int16 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        int int8 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 100);
        inventory0.setMilk((int) 'a');
        inventory0.setMilk(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) -1);
        inventory0.setSugar(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        int int18 = inventory0.getCoffee();
        inventory0.setMilk(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        int int15 = inventory0.getMilk();
        int int16 = inventory0.getMilk();
        int int17 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        int int15 = inventory0.getChocolate();
        inventory0.setChocolate((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        inventory0.setCoffee(100);
        java.lang.String str11 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str11.equals("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        java.lang.String str12 = inventory0.toString();
        inventory0.setMilk((int) '#');
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) -1);
        inventory0.setChocolate(15);
        inventory0.setSugar(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 10);
        int int9 = inventory0.getChocolate();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        int int12 = inventory0.getSugar();
        int int13 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 100);
        int int13 = inventory0.getSugar();
        java.lang.String str14 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n" + "'", str14.equals("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n"));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        inventory0.setMilk((int) '#');
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getSugar();
        try {
            inventory0.addChocolate("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setSugar(0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setMilk((int) (byte) 100);
        java.lang.String str3 = inventory0.toString();
        int int4 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str3.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 1);
        int int6 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        inventory0.setCoffee((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe12 = null;
        try {
            boolean boolean13 = inventory0.useIngredients(recipe12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        inventory0.setChocolate((int) (short) 10);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setMilk(0);
        java.lang.String str10 = inventory0.toString();
        inventory0.setCoffee(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        int int6 = inventory0.getCoffee();
        inventory0.setChocolate(0);
        inventory0.setSugar((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setSugar((int) (byte) 1);
        java.lang.String str17 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n" + "'", str17.equals("Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n"));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setMilk((int) '4');
        edu.ncsu.csc326.coffeemaker.Recipe recipe8 = null;
        try {
            boolean boolean9 = inventory0.useIngredients(recipe8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setSugar(32);
        inventory0.setMilk((int) 'a');
        int int13 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getMilk();
        java.lang.String str18 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str18.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setMilk((int) '4');
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setMilk((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        inventory0.setCoffee((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        inventory0.setSugar((int) (short) 100);
        java.lang.String str19 = inventory0.toString();
        inventory0.setMilk(100);
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str19.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        inventory0.setCoffee((int) ' ');
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        inventory0.setSugar(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        inventory0.setChocolate((int) (byte) 0);
        inventory0.setChocolate((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.String str6 = inventory0.toString();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) 'a');
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        java.lang.String str14 = inventory0.toString();
        inventory0.setChocolate(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str14.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) 'a');
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        java.lang.String str14 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str14.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        int int7 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 1\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setChocolate(15);
        inventory0.setMilk((int) 'a');
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        inventory0.setCoffee((int) (byte) 10);
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        int int11 = inventory0.getChocolate();
        inventory0.setMilk((int) (byte) 0);
        edu.ncsu.csc326.coffeemaker.Recipe recipe14 = null;
        try {
            boolean boolean15 = inventory0.useIngredients(recipe14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(10);
        inventory0.setChocolate((int) (short) 1);
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        java.lang.String str12 = inventory0.toString();
        inventory0.setMilk((int) '#');
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) -1);
        int int11 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe12 = null;
        try {
            boolean boolean13 = inventory0.useIngredients(recipe12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        java.lang.Class<?> wildcardClass15 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        java.lang.String str9 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 0\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) -1);
        inventory0.setChocolate(15);
        inventory0.setChocolate((int) (short) 100);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 100);
        edu.ncsu.csc326.coffeemaker.Recipe recipe19 = null;
        try {
            boolean boolean20 = inventory0.useIngredients(recipe19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getCoffee();
        inventory0.setSugar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getMilk();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setCoffee((int) (byte) -1);
        int int14 = inventory0.getCoffee();
        inventory0.setSugar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        java.lang.String str12 = inventory0.toString();
        inventory0.setChocolate((int) (short) 10);
        inventory0.setSugar(32);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        inventory0.setMilk((int) (short) 0);
        inventory0.setCoffee(97);
        inventory0.setMilk(15);
        inventory0.setCoffee(97);
        inventory0.setMilk((int) (short) -1);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getChocolate();
        inventory0.setCoffee(1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe16 = null;
        try {
            boolean boolean17 = inventory0.useIngredients(recipe16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getChocolate();
        inventory0.setSugar(100);
        int int10 = inventory0.getSugar();
        inventory0.setMilk(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) 'a');
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setMilk((int) (byte) -1);
        inventory0.setMilk((int) ' ');
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        int int20 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) 'a');
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        java.lang.String str14 = inventory0.toString();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str14.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) 'a');
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getCoffee();
        int int7 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getMilk();
        inventory0.setChocolate(32);
        java.lang.String str15 = inventory0.toString();
        inventory0.setSugar(15);
        try {
            inventory0.addCoffee("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n" + "'", str15.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n"));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        java.lang.String str2 = inventory0.toString();
        int int3 = inventory0.getCoffee();
        int int4 = inventory0.getCoffee();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getMilk();
        inventory0.setMilk(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str2.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        inventory0.setMilk(35);
        int int19 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        int int15 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 1);
        int int18 = inventory0.getChocolate();
        java.lang.String str19 = inventory0.toString();
        inventory0.setCoffee((int) '4');
        inventory0.setSugar(1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe24 = null;
        try {
            boolean boolean25 = inventory0.useIngredients(recipe24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n" + "'", str19.equals("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        inventory0.setSugar(100);
        inventory0.setSugar(97);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        int int15 = inventory0.getMilk();
        inventory0.setMilk(0);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        java.lang.String str10 = inventory0.toString();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        java.lang.String str12 = inventory0.toString();
        int int13 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str12.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getSugar();
        int int2 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int5 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 1\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        int int15 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 1);
        inventory0.setMilk((int) ' ');
        int int20 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        inventory0.setCoffee(10);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        try {
            inventory0.addCoffee("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setMilk((int) (byte) 100);
        java.lang.String str3 = inventory0.toString();
        int int4 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str3.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setMilk((int) (byte) 1);
        inventory0.setSugar((-1));
        inventory0.setCoffee((int) (byte) 10);
        int int14 = inventory0.getChocolate();
        int int15 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        int int10 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        int int11 = inventory0.getSugar();
        try {
            inventory0.addChocolate("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        inventory0.setMilk((int) '4');
        int int9 = inventory0.getSugar();
        inventory0.setCoffee(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        inventory0.setMilk((int) '4');
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) -1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe8 = null;
        try {
            boolean boolean9 = inventory0.useIngredients(recipe8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe2 = null;
        try {
            boolean boolean3 = inventory0.useIngredients(recipe2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        java.lang.String str2 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
        inventory0.setMilk((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str2.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        inventory0.setMilk((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setCoffee((int) (short) 1);
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 97\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 0);
        inventory0.setCoffee((int) (short) 100);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        inventory0.setSugar(100);
        inventory0.setSugar(97);
        inventory0.setMilk((int) (byte) 10);
        java.lang.String str16 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 10\nSugar: 97\nChocolate: 35\n" + "'", str16.equals("Coffee: 15\nMilk: 10\nSugar: 97\nChocolate: 35\n"));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getCoffee();
        int int7 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        inventory0.setMilk(15);
        int int16 = inventory0.getSugar();
        inventory0.setChocolate((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        inventory0.setSugar(100);
        java.lang.String str12 = inventory0.toString();
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str8.equals("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((-1));
        int int13 = inventory0.getCoffee();
        inventory0.setMilk((int) (byte) 1);
        inventory0.setSugar((int) (byte) -1);
        inventory0.setCoffee((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        int int14 = inventory0.getCoffee();
        inventory0.setMilk(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str17.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        inventory0.setChocolate(1);
        inventory0.setCoffee((int) (byte) 10);
        int int15 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        inventory0.setMilk((int) '4');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        java.lang.String str9 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        int int5 = inventory0.getMilk();
        inventory0.setSugar(100);
        inventory0.setSugar(10);
        int int10 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        int int12 = inventory0.getSugar();
        int int13 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        inventory0.setCoffee(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        java.lang.String str2 = inventory0.toString();
        int int3 = inventory0.getCoffee();
        int int4 = inventory0.getCoffee();
        java.lang.String str5 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str2.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe8 = null;
        try {
            boolean boolean9 = inventory0.useIngredients(recipe8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getCoffee();
        inventory0.setSugar((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str11.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setCoffee(100);
        inventory0.setSugar((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        int int5 = inventory0.getMilk();
        inventory0.setSugar(100);
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        java.lang.String str10 = inventory0.toString();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        java.lang.String str12 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str12.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        java.lang.String str10 = inventory0.toString();
        java.lang.String str11 = inventory0.toString();
        inventory0.setCoffee(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n" + "'", str11.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.String str11 = inventory0.toString();
        java.lang.String str12 = inventory0.toString();
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str11.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str12.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        inventory0.setChocolate((int) (byte) 10);
        int int17 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        java.lang.String str19 = inventory0.toString();
        int int20 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 10\n" + "'", str19.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 10\n"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getChocolate();
        int int11 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setCoffee(100);
        int int17 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe18 = null;
        try {
            boolean boolean19 = inventory0.useIngredients(recipe18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        inventory0.setCoffee((int) (byte) 0);
        int int10 = inventory0.getSugar();
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        inventory0.setChocolate((int) (byte) 10);
        int int17 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar((int) '4');
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        inventory0.setSugar((int) (short) 100);
        java.lang.String str19 = inventory0.toString();
        inventory0.setMilk(100);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str19.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getCoffee();
        inventory0.setChocolate((int) (byte) 0);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        inventory0.setChocolate(100);
        int int10 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        java.lang.String str10 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n"));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        int int12 = inventory0.getMilk();
        inventory0.setCoffee(15);
        inventory0.setChocolate((int) (byte) 100);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setCoffee(35);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        java.lang.String str11 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe12 = null;
        try {
            boolean boolean13 = inventory0.useIngredients(recipe12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        java.lang.String str12 = inventory0.toString();
        inventory0.setChocolate(1);
        inventory0.setCoffee(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n"));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getChocolate();
        inventory0.setCoffee(1);
        try {
            inventory0.addCoffee("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee(1);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        inventory0.setSugar((int) ' ');
        try {
            inventory0.addSugar("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        int int7 = inventory0.getMilk();
        inventory0.setCoffee((int) (short) 1);
        inventory0.setChocolate(15);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        inventory0.setChocolate(100);
        inventory0.setChocolate(0);
        inventory0.setSugar(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getSugar();
        inventory0.setCoffee(15);
        inventory0.setChocolate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setChocolate(0);
        edu.ncsu.csc326.coffeemaker.Recipe recipe18 = null;
        try {
            boolean boolean19 = inventory0.useIngredients(recipe18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        inventory0.setCoffee((int) (byte) 0);
        int int10 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int5 = inventory0.getCoffee();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setChocolate((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        int int7 = inventory0.getMilk();
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) ' ');
        inventory0.setSugar((int) '#');
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        int int8 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        inventory0.setMilk(10);
        int int22 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar(32);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getCoffee();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        int int7 = inventory0.getMilk();
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) ' ');
        inventory0.setMilk(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setMilk((int) '4');
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        inventory0.setChocolate((int) ' ');
        int int13 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        int int7 = inventory0.getMilk();
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        java.lang.String str11 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        int int14 = inventory0.getMilk();
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str11.equals("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setSugar(35);
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        int int11 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        java.lang.String str10 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        int int16 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) -1);
        int int7 = inventory0.getCoffee();
        inventory0.setSugar((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        java.lang.String str12 = inventory0.toString();
        inventory0.setMilk(0);
        int int15 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        int int13 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        inventory0.setChocolate((int) (byte) -1);
        int int10 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getMilk();
        inventory0.setChocolate(32);
        int int15 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe16 = null;
        try {
            boolean boolean17 = inventory0.useIngredients(recipe16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        int int18 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getChocolate();
        java.lang.String str11 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe12 = null;
        try {
            boolean boolean13 = inventory0.useIngredients(recipe12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str11.equals("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        int int6 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        inventory0.setChocolate(32);
        inventory0.setChocolate((int) '4');
        inventory0.setSugar((int) (short) 1);
        inventory0.setSugar((int) (short) 1);
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getCoffee();
        inventory0.setChocolate((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        inventory0.setChocolate(97);
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.String str6 = inventory0.toString();
        int int7 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setMilk((int) (byte) -1);
        inventory0.setCoffee(0);
        inventory0.setSugar(1);
        inventory0.setChocolate((int) (byte) 10);
        inventory0.setSugar((int) (byte) 1);
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) (short) 100);
        inventory0.setChocolate((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setCoffee((int) ' ');
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setCoffee((int) (short) 1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe9 = null;
        try {
            boolean boolean10 = inventory0.useIngredients(recipe9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        inventory0.setSugar((int) '4');
        int int11 = inventory0.getCoffee();
        java.lang.String str12 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 1\n" + "'", str12.equals("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 1\n"));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setCoffee(1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getCoffee();
        inventory0.setChocolate((int) 'a');
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setChocolate(0);
        inventory0.setMilk(10);
        int int20 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass21 = inventory0.getClass();
        int int22 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        int int6 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        java.lang.String str10 = inventory0.toString();
        int int11 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getCoffee();
        inventory0.setChocolate((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        int int15 = inventory0.getMilk();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar((int) '4');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getMilk();
        int int17 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getMilk();
        inventory0.setCoffee(0);
        int int21 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe22 = null;
        try {
            boolean boolean23 = inventory0.useIngredients(recipe22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        inventory0.setCoffee(10);
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        inventory0.setMilk(15);
        int int16 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        int int10 = inventory0.getSugar();
        inventory0.setCoffee(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getMilk();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        int int7 = inventory0.getMilk();
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) ' ');
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((int) '4');
        java.lang.Class<?> wildcardClass15 = inventory0.getClass();
        int int16 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        int int10 = inventory0.getMilk();
        inventory0.setMilk((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        int int10 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getChocolate();
        int int2 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar((int) (short) 100);
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        int int18 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setChocolate(0);
        int int18 = inventory0.getCoffee();
        int int19 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = inventory0.getClass();
        java.lang.String str23 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 0\n" + "'", str23.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 0\n"));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 0);
        try {
            inventory0.addMilk("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        java.lang.String str10 = inventory0.toString();
        int int11 = inventory0.getMilk();
        inventory0.setCoffee((int) (byte) 0);
        inventory0.setMilk((int) '#');
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setCoffee((int) (short) 1);
        int int9 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        int int10 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setMilk(0);
        java.lang.String str10 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        inventory0.setChocolate((int) (byte) 10);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        int int10 = inventory0.getMilk();
        inventory0.setSugar(97);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        inventory0.setChocolate(97);
        int int18 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        inventory0.setCoffee((int) (byte) 1);
        inventory0.setChocolate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        java.lang.String str10 = inventory0.toString();
        inventory0.setChocolate((-1));
        inventory0.setMilk((int) (byte) 100);
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getChocolate();
        int int11 = inventory0.getCoffee();
        inventory0.setMilk((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        int int15 = inventory0.getMilk();
        inventory0.setMilk(0);
        java.lang.String str18 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate(35);
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        int int10 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate((int) (short) 1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        int int20 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        java.lang.String str20 = inventory0.toString();
        int int21 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str20.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        inventory0.setChocolate((int) (byte) 0);
        inventory0.setCoffee(32);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setSugar(32);
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        inventory0.setMilk((int) (short) 0);
        inventory0.setCoffee(97);
        inventory0.setMilk(15);
        inventory0.setCoffee(97);
        inventory0.setMilk((int) (short) -1);
        int int26 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setChocolate(15);
        inventory0.setMilk((int) 'a');
        int int15 = inventory0.getSugar();
        java.lang.String str16 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n"));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(10);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setCoffee((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        inventory0.setSugar((int) (short) 100);
        java.lang.String str19 = inventory0.toString();
        int int20 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str19.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        java.lang.String str16 = inventory0.toString();
        inventory0.setMilk((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        java.lang.Class<?> wildcardClass20 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getSugar();
        inventory0.setMilk((int) (short) 10);
        edu.ncsu.csc326.coffeemaker.Recipe recipe16 = null;
        try {
            boolean boolean17 = inventory0.useIngredients(recipe16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        inventory0.setChocolate(1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        int int11 = inventory0.getChocolate();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setChocolate(0);
        edu.ncsu.csc326.coffeemaker.Recipe recipe16 = null;
        try {
            boolean boolean17 = inventory0.useIngredients(recipe16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((-1));
        int int13 = inventory0.getCoffee();
        inventory0.setMilk((int) (byte) 1);
        inventory0.setSugar((int) (byte) -1);
        inventory0.setSugar((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        int int5 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) 0);
        inventory0.setMilk(35);
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        int int11 = inventory0.getChocolate();
        int int12 = inventory0.getSugar();
        inventory0.setSugar(100);
        int int15 = inventory0.getMilk();
        int int16 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        inventory0.setMilk((int) (byte) -1);
        inventory0.setMilk((int) ' ');
        inventory0.setChocolate((int) (byte) -1);
        int int21 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        inventory0.setMilk((int) '4');
        int int9 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        int int11 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        int int13 = inventory0.getCoffee();
        inventory0.setCoffee((int) 'a');
        edu.ncsu.csc326.coffeemaker.Recipe recipe16 = null;
        try {
            boolean boolean17 = inventory0.useIngredients(recipe16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setChocolate(0);
        inventory0.setMilk(10);
        int int20 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass21 = inventory0.getClass();
        int int22 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        inventory0.setChocolate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar(0);
        inventory0.setChocolate((int) '#');
        int int11 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        inventory0.setSugar(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setMilk(1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }
}

