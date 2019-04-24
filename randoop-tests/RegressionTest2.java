import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (byte) 10);
        int int8 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        int int12 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 1\n");
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        inventory0.setMilk(97);
        inventory0.setSugar((int) (byte) 1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setSugar(35);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        int int18 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        int int8 = inventory0.getMilk();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 10);
        inventory0.setMilk((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setSugar((int) (byte) 10);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str18.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        int int16 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe14 = null;
        try {
            boolean boolean15 = inventory0.useIngredients(recipe14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        int int9 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        inventory0.setSugar(10);
        inventory0.setMilk((int) (byte) 0);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        int int15 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setSugar(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) -1);
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
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getChocolate();
        int int11 = inventory0.getMilk();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar((int) (byte) 100);
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int5 = inventory0.getCoffee();
        inventory0.setChocolate((int) (short) 1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setMilk((int) (byte) 1);
        int int10 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) (short) 100);
        int int7 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n" + "'", str20.equals("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        inventory0.setCoffee(10);
        int int10 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        int int14 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        int int21 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        int int8 = inventory0.getSugar();
        inventory0.setChocolate(15);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        inventory0.setCoffee((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 1\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setCoffee((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setMilk((int) (byte) 1);
        int int10 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 100);
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        inventory0.setCoffee((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        inventory0.setSugar((int) 'a');
        try {
            inventory0.addCoffee("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n");
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setChocolate((int) (short) 0);
        inventory0.setMilk((int) (short) 10);
        java.lang.String str13 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 10\nSugar: 10\nChocolate: 0\n" + "'", str13.equals("Coffee: 15\nMilk: 10\nSugar: 10\nChocolate: 0\n"));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar(0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        int int14 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass15 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n" + "'", str14.equals("Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n"));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        int int15 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 100);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str9.equals("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        inventory0.setChocolate((int) (short) -1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        inventory0.setCoffee(97);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        inventory0.setChocolate(0);
        edu.ncsu.csc326.coffeemaker.Recipe recipe16 = null;
        try {
            boolean boolean17 = inventory0.useIngredients(recipe16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        inventory0.setCoffee(10);
        int int10 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        inventory0.setSugar(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe9 = null;
        try {
            boolean boolean10 = inventory0.useIngredients(recipe9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        inventory0.setMilk((int) (short) -1);
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n");
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
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getCoffee();
        java.lang.String str6 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        int int18 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str17.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        inventory0.setCoffee(35);
        int int9 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
            inventory0.addMilk("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
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
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        int int19 = inventory0.getCoffee();
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        int int18 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        int int7 = inventory0.getCoffee();
        try {
            inventory0.addChocolate("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        inventory0.setCoffee((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        java.lang.Class<?> wildcardClass1 = inventory0.getClass();
        inventory0.setMilk(97);
        int int4 = inventory0.getMilk();
        inventory0.setSugar((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int5 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        inventory0.setMilk(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        int int7 = inventory0.getMilk();
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) ' ');
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
            inventory0.addChocolate("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) 'a');
        inventory0.setSugar((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.String str10 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        inventory0.setSugar(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.Class<?> wildcardClass16 = inventory0.getClass();
        int int17 = inventory0.getCoffee();
        inventory0.setChocolate((int) (short) 1);
        try {
            inventory0.addChocolate("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        edu.ncsu.csc326.coffeemaker.Recipe recipe14 = null;
        try {
            boolean boolean15 = inventory0.useIngredients(recipe14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        int int8 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        inventory0.setMilk((int) '4');
        inventory0.setSugar(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        inventory0.setChocolate(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        inventory0.setCoffee(32);
        java.lang.String str16 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 32\nMilk: 52\nSugar: 15\nChocolate: 35\n" + "'", str16.equals("Coffee: 32\nMilk: 52\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        inventory0.setCoffee(0);
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        inventory0.setChocolate(1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        int int10 = inventory0.getChocolate();
        inventory0.setMilk(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        inventory0.setMilk(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(0);
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n");
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setCoffee((int) ' ');
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getMilk();
        int int7 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        inventory0.setChocolate(10);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 10\nSugar: 0\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
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
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        int int5 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        int int9 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        inventory0.setSugar((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        inventory0.setChocolate(1);
        int int17 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate((int) (short) 1);
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getSugar();
        inventory0.setMilk((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(10);
        int int14 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) (byte) -1);
        int int7 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        java.lang.String str10 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setCoffee(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n"));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        inventory0.setCoffee((int) (byte) 1);
        inventory0.setCoffee((int) (short) -1);
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
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.String str6 = inventory0.toString();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        inventory0.setMilk((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        inventory0.setSugar(100);
        int int18 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getMilk();
        inventory0.setCoffee((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        inventory0.setChocolate((-1));
        int int19 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str8.equals("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        int int15 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str14.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        inventory0.setMilk((int) ' ');
        inventory0.setCoffee((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        inventory0.setSugar((int) (byte) 1);
        java.lang.String str12 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 1\nChocolate: 35\n" + "'", str12.equals("Coffee: 10\nMilk: 15\nSugar: 1\nChocolate: 35\n"));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getCoffee();
        inventory0.setChocolate((int) 'a');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        java.lang.String str15 = inventory0.toString();
        int int16 = inventory0.getMilk();
        java.lang.String str17 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n" + "'", str15.equals("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n" + "'", str17.equals("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n"));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setCoffee((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        int int13 = inventory0.getCoffee();
        inventory0.setMilk((int) (short) 100);
        inventory0.setCoffee(1);
        int int18 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar((int) '4');
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
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        int int12 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        inventory0.setCoffee(0);
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        inventory0.setChocolate(15);
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 0\n");
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        int int17 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        inventory0.setMilk((int) (short) -1);
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 10\nMilk: 15\nSugar: 1\nChocolate: 35\n");
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) '4');
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        int int19 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        int int22 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n" + "'", str19.equals("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setSugar(10);
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getCoffee();
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setSugar(32);
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        int int13 = inventory0.getCoffee();
        int int14 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        inventory0.setChocolate(1);
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        int int14 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setCoffee((int) (byte) 100);
        int int7 = inventory0.getMilk();
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) ' ');
        inventory0.setSugar((int) '#');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setSugar((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        int int13 = inventory0.getChocolate();
        int int14 = inventory0.getChocolate();
        inventory0.setSugar(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n");
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.String str10 = inventory0.toString();
        inventory0.setChocolate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        inventory0.setMilk((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        inventory0.setChocolate(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        inventory0.setCoffee((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        int int15 = inventory0.getMilk();
        inventory0.setSugar((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        int int18 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 10);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        inventory0.setChocolate((int) (short) 10);
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        int int12 = inventory0.getMilk();
        inventory0.setChocolate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        inventory0.setMilk(97);
        inventory0.setMilk(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        java.lang.String str10 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.String str12 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getCoffee();
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 1\n");
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        inventory0.setCoffee((int) '#');
        java.lang.String str13 = inventory0.toString();
        java.lang.String str14 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str13.equals("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str14.equals("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        inventory0.setCoffee(1);
        int int14 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        java.lang.String str2 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str2.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        inventory0.setChocolate((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.String str12 = inventory0.toString();
        inventory0.setCoffee((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        int int8 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 100);
        int int11 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        inventory0.setChocolate(1);
        inventory0.setChocolate(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 0);
        inventory0.setSugar(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setMilk((int) (byte) 1);
        int int10 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setMilk((int) (short) 10);
        int int15 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        java.lang.String str18 = inventory0.toString();
        inventory0.setMilk(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setCoffee((int) ' ');
        int int11 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        inventory0.setSugar((int) ' ');
        java.lang.String str16 = inventory0.toString();
        inventory0.setSugar(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 1\n"));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.String str20 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 10\n" + "'", str20.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 10\n"));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        int int16 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        inventory0.setChocolate(0);
        int int16 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        inventory0.setChocolate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setSugar((int) (byte) 1);
        try {
            inventory0.addMilk("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        inventory0.setChocolate((-1));
        int int19 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setMilk((int) (byte) 1);
        int int10 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setMilk((int) (short) 10);
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        int int19 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        inventory0.setMilk((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 10);
        inventory0.setCoffee((int) (short) 10);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
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
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getChocolate();
        inventory0.setChocolate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk(1);
        int int5 = inventory0.getCoffee();
        int int6 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        inventory0.setChocolate(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        inventory0.setMilk(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar((int) (short) 100);
        inventory0.setMilk((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        inventory0.setMilk((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
            inventory0.addCoffee("Coffee: 15\nMilk: 97\nSugar: 32\nChocolate: 15\n");
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        int int10 = inventory0.getMilk();
        inventory0.setMilk((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass6 = inventory0.getClass();
        int int7 = inventory0.getChocolate();
        java.lang.String str8 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getMilk();
        inventory0.setChocolate((int) '4');
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        inventory0.setSugar(32);
        java.lang.String str16 = inventory0.toString();
        inventory0.setMilk((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n" + "'", str16.equals("Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n"));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        edu.ncsu.csc326.coffeemaker.Recipe recipe8 = null;
        try {
            boolean boolean9 = inventory0.useIngredients(recipe8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setMilk((int) (byte) 1);
        int int10 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) -1);
        java.lang.String str13 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 100\nMilk: 1\nSugar: 15\nChocolate: 15\n" + "'", str13.equals("Coffee: 100\nMilk: 1\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        try {
            inventory0.addCoffee("Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n");
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar(32);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getCoffee();
        inventory0.setMilk((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        inventory0.setCoffee(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setSugar(1);
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        int int18 = inventory0.getMilk();
        int int19 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setChocolate((int) ' ');
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        inventory0.setSugar((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
            inventory0.addMilk("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n");
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        int int8 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 10\nSugar: 0\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 100);
        inventory0.setChocolate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setCoffee(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        int int11 = inventory0.getChocolate();
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        int int19 = inventory0.getCoffee();
        inventory0.setSugar(10);
        inventory0.setChocolate(35);
        int int24 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 97\nSugar: 32\nChocolate: 15\n");
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        inventory0.setSugar(0);
        inventory0.setSugar(0);
        inventory0.setChocolate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        try {
            inventory0.addChocolate("Coffee: 1\nMilk: 0\nSugar: 15\nChocolate: 15\n");
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        int int13 = inventory0.getCoffee();
        inventory0.setSugar((int) (short) 100);
        inventory0.setChocolate((int) (short) 0);
        inventory0.setChocolate(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        inventory0.setMilk((int) (short) 0);
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 32\nChocolate: 15\n");
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.lang.String str12 = inventory0.toString();
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str11.equals("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str12.equals("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        inventory0.setCoffee(0);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 32\nChocolate: 1\n");
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        int int11 = inventory0.getChocolate();
        inventory0.setSugar(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setSugar(10);
        inventory0.setChocolate((int) (short) 1);
        inventory0.setSugar(0);
        java.lang.String str15 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n" + "'", str15.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n"));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
            inventory0.addSugar("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        int int16 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        java.lang.String str18 = inventory0.toString();
        inventory0.setMilk((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate(35);
        inventory0.setMilk((int) (short) 0);
        java.lang.String str10 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe11 = null;
        try {
            boolean boolean12 = inventory0.useIngredients(recipe11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        int int14 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe15 = null;
        try {
            boolean boolean16 = inventory0.useIngredients(recipe15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setMilk((int) (byte) 0);
        inventory0.setSugar((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        inventory0.setMilk((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setMilk((int) 'a');
        inventory0.setMilk((int) (short) 0);
        inventory0.setChocolate(0);
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setMilk((int) '4');
        inventory0.setChocolate(100);
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate(35);
        inventory0.setMilk((int) (short) 0);
        int int10 = inventory0.getSugar();
        inventory0.setCoffee(100);
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        inventory0.setMilk((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        int int5 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar((int) (byte) 100);
        int int10 = inventory0.getCoffee();
        inventory0.setMilk(0);
        java.lang.String str13 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 0\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) 'a');
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 1\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        inventory0.setChocolate(0);
        int int16 = inventory0.getCoffee();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getCoffee();
        inventory0.setMilk(10);
        java.lang.String str6 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        inventory0.setSugar((int) (short) -1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setSugar(1);
        int int8 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 100\nChocolate: 1\n");
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setChocolate(15);
        inventory0.setSugar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        inventory0.setCoffee((int) 'a');
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        int int10 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getSugar();
        int int14 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getCoffee();
        java.lang.String str6 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        int int8 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        inventory0.setMilk((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        inventory0.setCoffee(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        inventory0.setMilk(97);
        inventory0.setSugar((int) (byte) 1);
        int int11 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        int int11 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        java.lang.String str15 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 10\n" + "'", str15.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 10\n"));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setSugar((int) (byte) 0);
        try {
            inventory0.addCoffee("");
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk(32);
        inventory0.setChocolate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        inventory0.setSugar((int) (short) 100);
        inventory0.setSugar((int) 'a');
        int int12 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        inventory0.setChocolate(15);
        inventory0.setChocolate((int) (short) 0);
        int int18 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
            inventory0.addSugar("Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        int int12 = inventory0.getSugar();
        inventory0.setChocolate(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        int int11 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        inventory0.setSugar((int) (byte) 10);
        edu.ncsu.csc326.coffeemaker.Recipe recipe14 = null;
        try {
            boolean boolean15 = inventory0.useIngredients(recipe14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setChocolate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        inventory0.setSugar((int) 'a');
        inventory0.setSugar(97);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
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
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar((int) (byte) 100);
        int int10 = inventory0.getCoffee();
        inventory0.setMilk(0);
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        inventory0.setChocolate(35);
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
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getChocolate();
        int int11 = inventory0.getCoffee();
        inventory0.setMilk(100);
        java.lang.String str14 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str14.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        inventory0.setMilk(0);
        int int15 = inventory0.getChocolate();
        inventory0.setMilk((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        inventory0.setCoffee(100);
        int int20 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        inventory0.setCoffee((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        inventory0.setChocolate((int) (short) 1);
        int int21 = inventory0.getCoffee();
        inventory0.setMilk(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk(1);
        int int5 = inventory0.getCoffee();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        int int8 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        inventory0.setMilk((int) '#');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
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
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        inventory0.setCoffee(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar((int) '4');
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        int int13 = inventory0.getCoffee();
        inventory0.setSugar((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        java.lang.String str2 = inventory0.toString();
        int int3 = inventory0.getCoffee();
        int int4 = inventory0.getCoffee();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str2.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getSugar();
        inventory0.setChocolate(52);
        java.lang.String str16 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 52\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 52\n"));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        try {
            inventory0.addMilk("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
        int int11 = inventory0.getMilk();
        inventory0.setChocolate((int) 'a');
        inventory0.setSugar(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.lang.Class<?> wildcardClass16 = inventory0.getClass();
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        int int18 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getCoffee();
        inventory0.setChocolate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str11.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        inventory0.setCoffee(97);
        inventory0.setChocolate((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk(1);
        int int5 = inventory0.getCoffee();
        int int6 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 52\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setSugar(32);
        int int11 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 0\n");
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 10\nSugar: 0\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate(35);
        inventory0.setMilk((int) (short) 0);
        inventory0.setCoffee(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.lang.String str16 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 10\nMilk: 0\nSugar: 15\nChocolate: 0\n" + "'", str16.equals("Coffee: 10\nMilk: 0\nSugar: 15\nChocolate: 0\n"));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getCoffee();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str11.equals("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 10\nSugar: 10\nChocolate: 0\n");
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        int int16 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        inventory0.setChocolate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.lang.String str12 = inventory0.toString();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str12.equals("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        inventory0.setChocolate(100);
        inventory0.setChocolate(0);
        int int12 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setChocolate(15);
        java.lang.String str13 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 15\n"));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        inventory0.setMilk(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        int int17 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 0\nSugar: 35\nChocolate: 1\n");
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        int int15 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str14.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        inventory0.setMilk((int) ' ');
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
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getSugar();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        try {
            inventory0.addCoffee("hi!");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setMilk((int) '4');
        inventory0.setChocolate(100);
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getMilk();
        inventory0.setChocolate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 10);
        java.lang.String str8 = inventory0.toString();
        inventory0.setCoffee(1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n"));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        int int13 = inventory0.getCoffee();
        inventory0.setMilk((int) (short) 100);
        inventory0.setChocolate((int) ' ');
        edu.ncsu.csc326.coffeemaker.Recipe recipe18 = null;
        try {
            boolean boolean19 = inventory0.useIngredients(recipe18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.lang.String str12 = inventory0.toString();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getMilk();
        inventory0.setChocolate((int) '4');
        int int10 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
        java.lang.String str10 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setSugar((int) (short) 100);
        int int8 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getChocolate();
        inventory0.setMilk(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        int int8 = inventory0.getChocolate();
        inventory0.setMilk((int) ' ');
        int int11 = inventory0.getChocolate();
        java.lang.String str12 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str12.equals("Coffee: 35\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        int int20 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        int int12 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n" + "'", str11.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getChocolate();
        int int11 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 0);
        int int8 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 100);
        inventory0.setMilk((int) 'a');
        inventory0.setCoffee((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate((int) (short) 1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setCoffee((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        inventory0.setMilk((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str19 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str19.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 52\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        inventory0.setMilk((int) '#');
        inventory0.setCoffee((int) ' ');
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.lang.String str15 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 35\n" + "'", str15.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 35\n"));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        inventory0.setChocolate(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n"));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        int int16 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n");
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        inventory0.setMilk((int) ' ');
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getCoffee();
        inventory0.setSugar(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 32\nSugar: 100\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 32\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 10);
        java.lang.String str8 = inventory0.toString();
        inventory0.setCoffee(1);
        int int11 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        inventory0.setChocolate((int) (short) 1);
        inventory0.setChocolate(35);
        try {
            inventory0.addChocolate("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setSugar((int) (short) 100);
        inventory0.setMilk(32);
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 97\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getMilk();
        int int6 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setMilk((int) 'a');
        int int10 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) (byte) -1);
        edu.ncsu.csc326.coffeemaker.Recipe recipe7 = null;
        try {
            boolean boolean8 = inventory0.useIngredients(recipe7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setMilk((int) (byte) 100);
        java.lang.String str3 = inventory0.toString();
        java.lang.String str4 = inventory0.toString();
        inventory0.setSugar(97);
        int int7 = inventory0.getSugar();
        inventory0.setSugar((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str3.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
        int int11 = inventory0.getMilk();
        inventory0.setChocolate((int) 'a');
        int int14 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setMilk((int) '4');
        inventory0.setSugar(0);
        try {
            inventory0.addChocolate("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.Class<?> wildcardClass15 = inventory0.getClass();
        inventory0.setSugar(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        java.lang.String str10 = inventory0.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        inventory0.setCoffee((int) '#');
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        java.lang.String str19 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str19.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        inventory0.setCoffee((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        int int16 = inventory0.getCoffee();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk((int) (short) -1);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        inventory0.setMilk(1);
        inventory0.setChocolate((int) '4');
        int int7 = inventory0.getSugar();
        int int8 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        inventory0.setCoffee(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        int int16 = inventory0.getChocolate();
        inventory0.setChocolate(32);
        int int19 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        inventory0.setChocolate(10);
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
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
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        int int10 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        inventory0.setSugar((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        inventory0.setCoffee(100);
        int int20 = inventory0.getCoffee();
        int int21 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
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
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        java.lang.String str24 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Coffee: 97\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str24.equals("Coffee: 97\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getMilk();
        java.lang.String str11 = inventory0.toString();
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getCoffee();
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getSugar();
        int int5 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.String str10 = inventory0.toString();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar((int) (short) 100);
        int int9 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        inventory0.setMilk(0);
        int int22 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 10);
        int int9 = inventory0.getChocolate();
        int int10 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setSugar((int) (byte) 10);
        int int10 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        int int11 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        int int13 = inventory0.getCoffee();
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        try {
            inventory0.addCoffee("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getCoffee();
        try {
            inventory0.addCoffee("Coffee: 32\nMilk: 52\nSugar: 15\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        inventory0.setSugar(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getChocolate();
        int int11 = inventory0.getCoffee();
        inventory0.setMilk(100);
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 1\nSugar: 15\nChocolate: 15\n");
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
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        int int21 = inventory0.getSugar();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        int int16 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        inventory0.setMilk((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n");
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
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getMilk();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 10\nSugar: 97\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        int int14 = inventory0.getSugar();
        inventory0.setSugar((int) (byte) 0);
        inventory0.setSugar(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        int int16 = inventory0.getChocolate();
        inventory0.setChocolate(35);
        java.lang.String str19 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 35\n" + "'", str19.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 35\n"));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        int int19 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass20 = inventory0.getClass();
        int int21 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
            inventory0.addCoffee("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        inventory0.setCoffee((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (byte) 10);
        int int8 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setSugar((int) (byte) 10);
        int int10 = inventory0.getCoffee();
        inventory0.setSugar((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        inventory0.setChocolate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
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
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        inventory0.setSugar(32);
        int int16 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe17 = null;
        try {
            boolean boolean18 = inventory0.useIngredients(recipe17);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getCoffee();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        inventory0.setCoffee((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee(35);
        inventory0.setSugar(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 1);
        inventory0.setCoffee((int) (byte) 1);
        int int8 = inventory0.getSugar();
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        inventory0.setSugar((int) (short) 100);
        inventory0.setSugar((int) 'a');
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setMilk((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar(15);
        inventory0.setCoffee(10);
        inventory0.setMilk((int) (short) 10);
        inventory0.setChocolate((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n" + "'", str17.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        int int21 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        inventory0.setChocolate((int) (byte) 1);
        int int12 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 100\nChocolate: 1\n");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        int int18 = inventory0.getMilk();
        int int19 = inventory0.getCoffee();
        int int20 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.String str6 = inventory0.toString();
        int int7 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        inventory0.setMilk(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        int int12 = inventory0.getSugar();
        java.lang.String str13 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        inventory0.setCoffee(100);
        int int20 = inventory0.getCoffee();
        int int21 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        inventory0.setChocolate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getMilk();
        inventory0.setChocolate((int) '4');
        int int10 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        int int16 = inventory0.getMilk();
        java.lang.String str17 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str17.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        inventory0.setSugar((int) '4');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 10\nSugar: 10\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        int int19 = inventory0.getSugar();
        java.lang.String str20 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        inventory0.setSugar((int) '4');
        inventory0.setChocolate((int) (byte) 1);
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
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getMilk();
        inventory0.setMilk(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        inventory0.setSugar(100);
        try {
            inventory0.addChocolate("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        inventory0.setMilk(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) (short) 100);
        inventory0.setChocolate(1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        int int9 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(0);
        int int14 = inventory0.getMilk();
        int int15 = inventory0.getSugar();
        java.lang.String str16 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 0\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 0\n"));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        inventory0.setCoffee(100);
        int int8 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getMilk();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        inventory0.setChocolate(1);
        inventory0.setSugar((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        int int15 = inventory0.getSugar();
        inventory0.setMilk((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        int int7 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        int int15 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        java.lang.String str18 = inventory0.toString();
        inventory0.setSugar((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 10\nSugar: 0\nChocolate: 35\n" + "'", str18.equals("Coffee: 15\nMilk: 10\nSugar: 0\nChocolate: 35\n"));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        int int15 = inventory0.getCoffee();
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        inventory0.setMilk(35);
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 15\nSugar: 1\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) '4');
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        int int15 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        int int5 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        java.lang.String str8 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str8.equals("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
            inventory0.addCoffee("");
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        int int16 = inventory0.getChocolate();
        int int17 = inventory0.getMilk();
        int int18 = inventory0.getCoffee();
        int int19 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        inventory0.setCoffee(15);
        int int10 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        int int8 = inventory0.getSugar();
        int int9 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 10\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        int int7 = inventory0.getSugar();
        inventory0.setChocolate(52);
        inventory0.setSugar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        int int5 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        inventory0.setChocolate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        int int15 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 10);
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setCoffee((int) (short) 1);
        int int10 = inventory0.getCoffee();
        inventory0.setSugar(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        java.lang.String str10 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setCoffee(15);
        int int15 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        inventory0.setCoffee((int) (short) 100);
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.lang.String str17 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 100\n" + "'", str17.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 100\n"));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setChocolate(15);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        inventory0.setChocolate(10);
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
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        inventory0.setMilk(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n"));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar((int) '4');
        int int10 = inventory0.getSugar();
        inventory0.setCoffee(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        inventory0.setChocolate((int) (short) 1);
        inventory0.setCoffee(32);
        java.lang.String str23 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Coffee: 32\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str23.equals("Coffee: 32\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setChocolate((int) (short) 0);
        inventory0.setMilk((int) (short) 10);
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 1);
        int int6 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        int int8 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar(32);
        int int9 = inventory0.getMilk();
        inventory0.setCoffee(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
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
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        int int15 = inventory0.getSugar();
        int int16 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        inventory0.setCoffee((int) '#');
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        int int13 = inventory0.getCoffee();
        inventory0.setMilk((int) (short) 100);
        inventory0.setCoffee(1);
        int int18 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        java.lang.Class<?> wildcardClass20 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        inventory0.setCoffee((int) (byte) 1);
        inventory0.setChocolate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
            inventory0.addChocolate("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        inventory0.setMilk(0);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }
}

