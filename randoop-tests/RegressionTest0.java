import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        try {
            inventory0.addMilk("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        try {
            inventory0.addChocolate("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe2 = null;
        try {
            boolean boolean3 = inventory0.useIngredients(recipe2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        try {
            inventory0.addChocolate("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        try {
            inventory0.addSugar("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        try {
            inventory0.addCoffee("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        try {
            inventory0.addCoffee("");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
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
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
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
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        int int7 = inventory0.getMilk();
        edu.ncsu.csc326.coffeemaker.Recipe recipe8 = null;
        try {
            boolean boolean9 = inventory0.useIngredients(recipe8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe4 = null;
        try {
            boolean boolean5 = inventory0.useIngredients(recipe4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        int int7 = inventory0.getMilk();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addChocolate("hi!");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        int int15 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        inventory0.setSugar(10);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        inventory0.setSugar((int) ' ');
        try {
            inventory0.addMilk("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addCoffee("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar(0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((-1));
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        inventory0.setCoffee(15);
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 10);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        inventory0.setChocolate((int) (short) 10);
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        edu.ncsu.csc326.coffeemaker.Recipe recipe14 = null;
        try {
            boolean boolean15 = inventory0.useIngredients(recipe14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        try {
            inventory0.addSugar("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        try {
            inventory0.addCoffee("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        try {
            inventory0.addSugar("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setCoffee((int) ' ');
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe5 = null;
        try {
            boolean boolean6 = inventory0.useIngredients(recipe5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.String str6 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setCoffee((int) ' ');
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        edu.ncsu.csc326.coffeemaker.Recipe recipe21 = null;
        try {
            boolean boolean22 = inventory0.useIngredients(recipe21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
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
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        inventory0.setCoffee(1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk(1);
        inventory0.setChocolate((int) '4');
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe8 = null;
        try {
            boolean boolean9 = inventory0.useIngredients(recipe8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        inventory0.setCoffee((int) (byte) 1);
        inventory0.setMilk((int) (short) 0);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
            inventory0.addChocolate("");
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
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getChocolate();
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        try {
            inventory0.addCoffee("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
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
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setMilk((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
            inventory0.addSugar("");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setMilk((int) 'a');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe5 = null;
        try {
            boolean boolean6 = inventory0.useIngredients(recipe5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
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
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        inventory0.setCoffee(1);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        edu.ncsu.csc326.coffeemaker.Recipe recipe9 = null;
        try {
            boolean boolean10 = inventory0.useIngredients(recipe9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setSugar(32);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setMilk((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        inventory0.setMilk((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getMilk();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe13 = null;
        try {
            boolean boolean14 = inventory0.useIngredients(recipe13);
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        inventory0.setSugar((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        inventory0.setChocolate((int) (byte) -1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        inventory0.setChocolate(100);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setSugar(1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.String str11 = inventory0.toString();
        inventory0.setCoffee((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str11.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        int int14 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        int int5 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) 0);
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        try {
            inventory0.addChocolate("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        java.lang.String str10 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n"));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 100);
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        inventory0.setMilk(1);
        try {
            inventory0.addMilk("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 10);
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        int int7 = inventory0.getCoffee();
        inventory0.setSugar((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getMilk();
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk((int) (byte) 0);
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        inventory0.setSugar(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        try {
            inventory0.addChocolate("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        int int11 = inventory0.getMilk();
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe9 = null;
        try {
            boolean boolean10 = inventory0.useIngredients(recipe9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe6 = null;
        try {
            boolean boolean7 = inventory0.useIngredients(recipe6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setMilk((int) '4');
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        try {
            inventory0.addCoffee("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setChocolate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        int int15 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        int int13 = inventory0.getMilk();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        inventory0.setCoffee((int) (byte) 100);
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) -1);
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk(1);
        int int5 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (byte) 10);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setChocolate((int) (short) 0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setMilk((int) '4');
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        inventory0.setMilk((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) '4');
        int int12 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 10);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        java.lang.String str9 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str9.equals("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
            inventory0.addMilk("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        java.lang.String str5 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addMilk("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk((int) '4');
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        try {
            inventory0.addChocolate("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getMilk();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        inventory0.setSugar((int) ' ');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        inventory0.setMilk((int) '4');
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setMilk((int) (byte) 1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setCoffee((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n" + "'", str8.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n"));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        try {
            inventory0.addMilk("");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        int int13 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        inventory0.setCoffee((int) (byte) 1);
        inventory0.setMilk((int) (short) 0);
        edu.ncsu.csc326.coffeemaker.Recipe recipe16 = null;
        try {
            boolean boolean17 = inventory0.useIngredients(recipe16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        int int17 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 10);
        inventory0.setMilk(1);
        try {
            inventory0.addChocolate("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        inventory0.setSugar((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee((-1));
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        int int5 = inventory0.getSugar();
        inventory0.setSugar(0);
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.String str10 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        java.lang.String str8 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe9 = null;
        try {
            boolean boolean10 = inventory0.useIngredients(recipe9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        inventory0.setMilk((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        inventory0.setCoffee(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        inventory0.setMilk(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
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
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        int int5 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) 0);
        inventory0.setChocolate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setChocolate(32);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setMilk(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        int int6 = inventory0.getCoffee();
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        edu.ncsu.csc326.coffeemaker.Recipe recipe19 = null;
        try {
            boolean boolean20 = inventory0.useIngredients(recipe19);
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
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setMilk((int) (short) 100);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        int int7 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        inventory0.setMilk((int) '4');
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
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        inventory0.setSugar((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        java.lang.String str9 = inventory0.toString();
        inventory0.setMilk(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        java.lang.String str10 = inventory0.toString();
        int int11 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getCoffee();
        int int11 = inventory0.getChocolate();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        inventory0.setMilk((int) (byte) 100);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        java.lang.String str10 = inventory0.toString();
        inventory0.setCoffee((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        inventory0.setChocolate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        inventory0.setMilk((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        int int13 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getChocolate();
        int int2 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) (short) 100);
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
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
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setSugar(10);
        inventory0.setChocolate((int) (short) 1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe13 = null;
        try {
            boolean boolean14 = inventory0.useIngredients(recipe13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        int int19 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        int int16 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setCoffee(10);
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        inventory0.setSugar((int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe25 = null;
        try {
            boolean boolean26 = inventory0.useIngredients(recipe25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getChocolate();
        inventory0.setSugar(97);
        int int11 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.String str11 = inventory0.toString();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str11.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        inventory0.setSugar((int) (byte) 1);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk((int) '4');
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setMilk(52);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        inventory0.setCoffee((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) '4');
        int int12 = inventory0.getMilk();
        edu.ncsu.csc326.coffeemaker.Recipe recipe13 = null;
        try {
            boolean boolean14 = inventory0.useIngredients(recipe13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        int int16 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        int int13 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        int int13 = inventory0.getCoffee();
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
            inventory0.addMilk("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) -1);
        inventory0.setCoffee((-1));
        try {
            inventory0.addCoffee("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar(0);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        int int22 = inventory0.getMilk();
        try {
            inventory0.addCoffee("");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setSugar(10);
        inventory0.setSugar((int) (byte) 1);
        inventory0.setCoffee((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
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
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        java.lang.Class<?> wildcardClass1 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe2 = null;
        try {
            boolean boolean3 = inventory0.useIngredients(recipe2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) -1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        inventory0.setMilk(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str11.equals("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        inventory0.setChocolate(100);
        inventory0.setChocolate((int) (short) 1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        java.lang.String str9 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setChocolate(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe5 = null;
        try {
            boolean boolean6 = inventory0.useIngredients(recipe5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        inventory0.setChocolate(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        edu.ncsu.csc326.coffeemaker.Recipe recipe9 = null;
        try {
            boolean boolean10 = inventory0.useIngredients(recipe9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        inventory0.setChocolate(32);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getCoffee();
        java.lang.String str13 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n"));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        inventory0.setMilk(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 1);
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        inventory0.setCoffee(15);
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setChocolate((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        inventory0.setMilk((int) '4');
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setSugar(0);
        inventory0.setSugar(0);
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
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setChocolate((int) (short) 0);
        int int11 = inventory0.getCoffee();
        inventory0.setChocolate((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        try {
            inventory0.addMilk("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        inventory0.setCoffee((int) (byte) 100);
        int int10 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        java.lang.String str10 = inventory0.toString();
        int int11 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
            inventory0.addCoffee("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe4 = null;
        try {
            boolean boolean5 = inventory0.useIngredients(recipe4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n"));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        try {
            inventory0.addCoffee("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate(35);
        inventory0.setMilk((int) (short) 0);
        int int10 = inventory0.getChocolate();
        java.lang.String str11 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 35\n" + "'", str11.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 35\n"));
    }
}

