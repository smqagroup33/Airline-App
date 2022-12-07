package airline.blackbox;

import java.util.Scanner;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import AirlineReservationSystem.AirLineApp;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AirLineTestBB {
	
	//Dummy commit 2
    public static boolean debug = false;

    @Test
    public void PersonDetails01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void PersonDetails02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails02");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.String str5 = personDetails0.getsAddress();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void PersonDetails03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails03");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        java.lang.String str1 = personDetails0.nPhoneNumber;
        personDetails0.nAge = (-1);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void PersonDetails04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails04");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        java.lang.String str1 = personDetails0.nPhoneNumber;
        long long2 = personDetails0.nAge;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void PersonDetails05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails05");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        long long5 = personDetails0.getnAge();
        personDetails0.nPhoneNumber = "";
        personDetails0.setnPhoneNumber("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void PersonDetails06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails06");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setnAge((long) (byte) 1);
        java.lang.String str7 = personDetails0.getsName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void PersonDetails07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails07");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        java.lang.String str1 = personDetails0.sName;
        personDetails0.nAge = ' ';
        personDetails0.setnPhoneNumber("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void PersonDetails08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails08");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        long long4 = personDetails0.nAge;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void PersonDetails09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails09");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setnAge((long) (byte) 1);
        java.lang.Boolean boolean8 = personDetails0.setsName("hi!");
        long long9 = personDetails0.getnAge();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void PersonDetails10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails10");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        long long5 = personDetails0.getnAge();
        personDetails0.nPhoneNumber = "";
        personDetails0.sAddress = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void PersonDetails11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails11");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        java.lang.String str1 = personDetails0.sName;
        java.lang.String str2 = personDetails0.getsAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void PersonDetails12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails12");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.getsName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void PersonDetails13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails13");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        java.lang.String str1 = personDetails0.getsAddress();
        java.lang.Boolean boolean3 = personDetails0.setsAddress("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void PersonDetails14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails14");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        long long4 = personDetails0.getnAge();
        java.lang.Class<?> wildcardClass5 = personDetails0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void PersonDetails15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails15");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setsName("");
        personDetails0.nAge = ' ';
        java.lang.String str9 = personDetails0.sAddress;
        personDetails0.sAddress = "hi!";
        personDetails0.sName = "hi!";
        java.lang.String str14 = personDetails0.getsName();
        java.lang.Boolean boolean16 = personDetails0.setsAddress("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void PersonDetails16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails16");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        long long5 = personDetails0.getnAge();
        personDetails0.nPhoneNumber = "";
        java.lang.Boolean boolean9 = personDetails0.setsAddress("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void PersonDetails17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails17");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        long long5 = personDetails0.getnAge();
        java.lang.String str6 = personDetails0.sAddress;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void PersonDetails18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails18");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setsName("");
        java.lang.Boolean boolean8 = personDetails0.setnAge((long) (byte) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
    }

    @Test
    public void PersonDetails19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails19");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setsAddress("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void PersonDetails20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails20");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setsName("");
        personDetails0.nAge = ' ';
        java.lang.String str9 = personDetails0.sAddress;
        personDetails0.sAddress = "hi!";
        java.lang.String str12 = personDetails0.sAddress;
        long long13 = personDetails0.getnAge();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void PersonDetails21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails21");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setsName("");
        personDetails0.nAge = ' ';
        java.lang.String str9 = personDetails0.sAddress;
        personDetails0.sAddress = "hi!";
        personDetails0.sName = "hi!";
        java.lang.String str14 = personDetails0.getsName();
        personDetails0.sName = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void PersonDetails22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails22");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        long long1 = personDetails0.nAge;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void PersonDetails23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails23");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setnAge((long) (byte) 1);
        java.lang.Class<?> wildcardClass7 = personDetails0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void PersonDetails24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails24");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        java.lang.String str1 = personDetails0.nPhoneNumber;
        java.lang.String str2 = personDetails0.getnPhoneNumber();
        long long3 = personDetails0.nAge;
        personDetails0.nPhoneNumber = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void PersonDetails25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails25");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setsName("");
        personDetails0.nAge = ' ';
        java.lang.String str9 = personDetails0.sAddress;
        java.lang.Class<?> wildcardClass10 = personDetails0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void PersonDetails26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails26");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        long long5 = personDetails0.getnAge();
        long long6 = personDetails0.nAge;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void PersonDetails27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails27");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        long long4 = personDetails0.getnAge();
        java.lang.String str5 = personDetails0.getnPhoneNumber();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void PersonDetails28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PersonDetails28");
        AirlineReservationSystem.PersonDetails personDetails0 = new AirlineReservationSystem.PersonDetails();
        personDetails0.sAddress = "";
        java.lang.String str3 = personDetails0.sName;
        java.lang.String str4 = personDetails0.sAddress;
        java.lang.Boolean boolean6 = personDetails0.setsName("");
        personDetails0.nAge = ' ';
        java.lang.String str9 = personDetails0.sAddress;
        personDetails0.sAddress = "hi!";
        java.lang.String str12 = personDetails0.sAddress;
        personDetails0.nAge = (byte) 1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }
    @Test
    public void Person01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person01");
        AirlineReservationSystem.Person.showPersonTable();
    }

    @Test
    public void Person02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person02");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person03");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = null;
        AirlineReservationSystem.Person person5 = new AirlineReservationSystem.Person(personDetails4);
        AirlineReservationSystem.PersonDetails personDetails6 = null;
        AirlineReservationSystem.Person person7 = new AirlineReservationSystem.Person(personDetails6);
        AirlineReservationSystem.PersonDetails personDetails8 = null;
        person7.persnDet = personDetails8;
        AirlineReservationSystem.Person[] personArray10 = new AirlineReservationSystem.Person[] { person1, person5, person7 };
        java.util.ArrayList<AirlineReservationSystem.Person> personList11 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList11, personArray10);
        // The following exception was thrown during execution in Person generation
        try {
            java.lang.Boolean boolean13 = AirlineReservationSystem.Person.IteratePersonObject(personList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"sName\" because \"pObject.persnDet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(personArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void Person04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person04");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        java.lang.Class<?> wildcardClass5 = person1.getClass();
        org.junit.Assert.assertNull(personDetails4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Person05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person05");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        AirlineReservationSystem.PersonDetails personDetails7 = null;
        AirlineReservationSystem.Person person8 = new AirlineReservationSystem.Person(personDetails7);
        AirlineReservationSystem.PersonDetails personDetails9 = null;
        person8.persnDet = personDetails9;
        AirlineReservationSystem.PersonDetails personDetails11 = person8.persnDet;
        AirlineReservationSystem.PersonDetails personDetails12 = null;
        AirlineReservationSystem.Person person13 = new AirlineReservationSystem.Person(personDetails12);
        AirlineReservationSystem.PersonDetails personDetails14 = null;
        person13.persnDet = personDetails14;
        AirlineReservationSystem.PersonDetails personDetails16 = null;
        AirlineReservationSystem.Person person17 = new AirlineReservationSystem.Person(personDetails16);
        AirlineReservationSystem.PersonDetails personDetails18 = null;
        person17.persnDet = personDetails18;
        AirlineReservationSystem.PersonDetails personDetails20 = person17.persnDet;
        AirlineReservationSystem.PersonDetails personDetails21 = null;
        person17.persnDet = personDetails21;
        AirlineReservationSystem.Person[] personArray23 = new AirlineReservationSystem.Person[] { person1, person8, person13, person17 };
        java.util.ArrayList<AirlineReservationSystem.Person> personList24 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList24, personArray23);
        // The following exception was thrown during execution in Person generation
        try {
            java.lang.Boolean boolean26 = AirlineReservationSystem.Person.IteratePersonObject(personList24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"sName\" because \"pObject.persnDet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(personDetails4);
        org.junit.Assert.assertNull(personDetails11);
        org.junit.Assert.assertNull(personDetails20);
        org.junit.Assert.assertNotNull(personArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void Person06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person06");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        java.lang.Class<?> wildcardClass4 = person1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Person07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person07");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        java.lang.Class<?> wildcardClass2 = person1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Person08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person08");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(0, 1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person09");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person10");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine(0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person11");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person12");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        AirlineReservationSystem.PersonDetails personDetails7 = person1.persnDet;
        java.lang.Class<?> wildcardClass8 = person1.getClass();
        org.junit.Assert.assertNull(personDetails4);
        org.junit.Assert.assertNull(personDetails7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Person13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person13");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        AirlineReservationSystem.PersonDetails personDetails7 = null;
        person1.persnDet = personDetails7;
        AirlineReservationSystem.Person[] personArray9 = new AirlineReservationSystem.Person[] { person1 };
        java.util.ArrayList<AirlineReservationSystem.Person> personList10 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList10, personArray9);
        // The following exception was thrown during execution in Person generation
        try {
            java.lang.Boolean boolean12 = AirlineReservationSystem.Person.IteratePersonObject(personList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"sName\" because \"pObject.persnDet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(personDetails4);
        org.junit.Assert.assertNotNull(personArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void Person14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person14");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = null;
        person1.persnDet = personDetails4;
        AirlineReservationSystem.PersonDetails personDetails6 = null;
        AirlineReservationSystem.Person person7 = new AirlineReservationSystem.Person(personDetails6);
        AirlineReservationSystem.PersonDetails personDetails8 = null;
        person7.persnDet = personDetails8;
        AirlineReservationSystem.PersonDetails personDetails10 = null;
        person7.persnDet = personDetails10;
        AirlineReservationSystem.PersonDetails personDetails12 = null;
        AirlineReservationSystem.Person person13 = new AirlineReservationSystem.Person(personDetails12);
        AirlineReservationSystem.PersonDetails personDetails14 = null;
        person13.persnDet = personDetails14;
        AirlineReservationSystem.PersonDetails personDetails16 = person13.persnDet;
        AirlineReservationSystem.PersonDetails personDetails17 = null;
        AirlineReservationSystem.Person person18 = new AirlineReservationSystem.Person(personDetails17);
        AirlineReservationSystem.PersonDetails personDetails19 = null;
        person18.persnDet = personDetails19;
        AirlineReservationSystem.PersonDetails personDetails21 = null;
        person18.persnDet = personDetails21;
        AirlineReservationSystem.PersonDetails personDetails23 = null;
        AirlineReservationSystem.Person person24 = new AirlineReservationSystem.Person(personDetails23);
        AirlineReservationSystem.PersonDetails personDetails25 = null;
        person24.persnDet = personDetails25;
        AirlineReservationSystem.PersonDetails personDetails27 = person24.persnDet;
        AirlineReservationSystem.PersonDetails personDetails28 = null;
        person24.persnDet = personDetails28;
        AirlineReservationSystem.PersonDetails personDetails30 = null;
        AirlineReservationSystem.Person person31 = new AirlineReservationSystem.Person(personDetails30);
        AirlineReservationSystem.PersonDetails personDetails32 = null;
        person31.persnDet = personDetails32;
        AirlineReservationSystem.PersonDetails personDetails34 = null;
        AirlineReservationSystem.Person person35 = new AirlineReservationSystem.Person(personDetails34);
        AirlineReservationSystem.PersonDetails personDetails36 = null;
        person35.persnDet = personDetails36;
        AirlineReservationSystem.Person[] personArray38 = new AirlineReservationSystem.Person[] { person1, person7, person13, person18, person24, person31, person35 };
        java.util.ArrayList<AirlineReservationSystem.Person> personList39 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList39, personArray38);
        // The following exception was thrown during execution in Person generation
        try {
            java.lang.Boolean boolean41 = AirlineReservationSystem.Person.IteratePersonObject(personList39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"sName\" because \"pObject.persnDet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(personDetails16);
        org.junit.Assert.assertNull(personDetails27);
        org.junit.Assert.assertNotNull(personArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void Person15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void Person16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person16");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person17");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) 'a', (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person18");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine(0, 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person19");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person20");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = null;
        person1.persnDet = personDetails4;
        java.lang.Class<?> wildcardClass6 = person1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Person21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person21");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person22");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        AirlineReservationSystem.PersonDetails personDetails7 = null;
        person1.persnDet = personDetails7;
        AirlineReservationSystem.PersonDetails personDetails9 = null;
        person1.persnDet = personDetails9;
        org.junit.Assert.assertNull(personDetails4);
    }

    @Test
    public void Person23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person23");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) '#', (-1));
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person24");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails3 = null;
        person1.persnDet = personDetails3;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        org.junit.Assert.assertNull(personDetails2);
    }

    @Test
    public void Person25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person25");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        AirlineReservationSystem.PersonDetails personDetails7 = null;
        AirlineReservationSystem.Person person8 = new AirlineReservationSystem.Person(personDetails7);
        AirlineReservationSystem.PersonDetails personDetails9 = null;
        person8.persnDet = personDetails9;
        AirlineReservationSystem.PersonDetails personDetails11 = null;
        person8.persnDet = personDetails11;
        AirlineReservationSystem.PersonDetails personDetails13 = null;
        AirlineReservationSystem.Person person14 = new AirlineReservationSystem.Person(personDetails13);
        AirlineReservationSystem.PersonDetails personDetails15 = null;
        person14.persnDet = personDetails15;
        AirlineReservationSystem.PersonDetails personDetails17 = person14.persnDet;
        AirlineReservationSystem.PersonDetails personDetails18 = null;
        person14.persnDet = personDetails18;
        AirlineReservationSystem.PersonDetails personDetails20 = null;
        AirlineReservationSystem.Person person21 = new AirlineReservationSystem.Person(personDetails20);
        AirlineReservationSystem.PersonDetails personDetails22 = null;
        AirlineReservationSystem.Person person23 = new AirlineReservationSystem.Person(personDetails22);
        AirlineReservationSystem.PersonDetails personDetails24 = person23.persnDet;
        AirlineReservationSystem.PersonDetails personDetails25 = null;
        person23.persnDet = personDetails25;
        AirlineReservationSystem.PersonDetails personDetails27 = null;
        AirlineReservationSystem.Person person28 = new AirlineReservationSystem.Person(personDetails27);
        AirlineReservationSystem.PersonDetails personDetails29 = null;
        person28.persnDet = personDetails29;
        AirlineReservationSystem.PersonDetails personDetails31 = person28.persnDet;
        AirlineReservationSystem.PersonDetails personDetails32 = null;
        person28.persnDet = personDetails32;
        AirlineReservationSystem.PersonDetails personDetails34 = null;
        person28.persnDet = personDetails34;
        AirlineReservationSystem.PersonDetails personDetails36 = null;
        person28.persnDet = personDetails36;
        AirlineReservationSystem.Person[] personArray38 = new AirlineReservationSystem.Person[] { person1, person8, person14, person21, person23, person28 };
        java.util.ArrayList<AirlineReservationSystem.Person> personList39 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList39, personArray38);
        // The following exception was thrown during execution in Person generation
        try {
            java.lang.Boolean boolean41 = AirlineReservationSystem.Person.IteratePersonObject(personList39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"sName\" because \"pObject.persnDet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(personDetails4);
        org.junit.Assert.assertNull(personDetails17);
        org.junit.Assert.assertNull(personDetails24);
        org.junit.Assert.assertNull(personDetails31);
        org.junit.Assert.assertNotNull(personArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void Person26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person26");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person27");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        AirlineReservationSystem.PersonDetails personDetails7 = null;
        AirlineReservationSystem.Person person8 = new AirlineReservationSystem.Person(personDetails7);
        AirlineReservationSystem.PersonDetails personDetails9 = null;
        person8.persnDet = personDetails9;
        AirlineReservationSystem.PersonDetails personDetails11 = person8.persnDet;
        AirlineReservationSystem.PersonDetails personDetails12 = null;
        person8.persnDet = personDetails12;
        AirlineReservationSystem.PersonDetails personDetails14 = null;
        person8.persnDet = personDetails14;
        AirlineReservationSystem.PersonDetails personDetails16 = null;
        person8.persnDet = personDetails16;
        AirlineReservationSystem.PersonDetails personDetails18 = null;
        AirlineReservationSystem.Person person19 = new AirlineReservationSystem.Person(personDetails18);
        AirlineReservationSystem.PersonDetails personDetails20 = person19.persnDet;
        AirlineReservationSystem.Person[] personArray21 = new AirlineReservationSystem.Person[] { person1, person8, person19 };
        java.util.ArrayList<AirlineReservationSystem.Person> personList22 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList22, personArray21);
        // The following exception was thrown during execution in Person generation
        try {
            java.lang.Boolean boolean24 = AirlineReservationSystem.Person.IteratePersonObject(personList22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"sName\" because \"pObject.persnDet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(personDetails4);
        org.junit.Assert.assertNull(personDetails11);
        org.junit.Assert.assertNull(personDetails20);
        org.junit.Assert.assertNotNull(personArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void Person28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person28");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person29");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person30");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person31");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) ' ', 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void Person32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person32");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = null;
        person1.persnDet = personDetails4;
        AirlineReservationSystem.PersonDetails personDetails6 = null;
        person1.persnDet = personDetails6;
        java.lang.Class<?> wildcardClass8 = person1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Person33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person33");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        AirlineReservationSystem.PersonDetails personDetails7 = person1.persnDet;
        // The following exception was thrown during execution in Person generation
        try {
            java.lang.Class<?> wildcardClass8 = personDetails7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(personDetails4);
        org.junit.Assert.assertNull(personDetails7);
    }

    @Test
    public void Person34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person34");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails3 = person1.persnDet;
        org.junit.Assert.assertNull(personDetails2);
        org.junit.Assert.assertNull(personDetails3);
    }

    @Test
    public void Person35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person35");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = person1.persnDet;
        AirlineReservationSystem.PersonDetails personDetails5 = null;
        person1.persnDet = personDetails5;
        AirlineReservationSystem.PersonDetails personDetails7 = null;
        person1.persnDet = personDetails7;
        AirlineReservationSystem.PersonDetails personDetails9 = person1.persnDet;
        org.junit.Assert.assertNull(personDetails4);
        org.junit.Assert.assertNull(personDetails9);
    }

    @Test
    public void Person36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person36");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine(1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person37");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = null;
        person1.persnDet = personDetails4;
        AirlineReservationSystem.PersonDetails personDetails6 = null;
        person1.persnDet = personDetails6;
        AirlineReservationSystem.PersonDetails personDetails8 = person1.persnDet;
        org.junit.Assert.assertNull(personDetails8);
    }

    @Test
    public void Person38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person38");
        AirlineReservationSystem.PersonDetails personDetails0 = null;
        AirlineReservationSystem.Person person1 = new AirlineReservationSystem.Person(personDetails0);
        AirlineReservationSystem.PersonDetails personDetails2 = null;
        person1.persnDet = personDetails2;
        AirlineReservationSystem.PersonDetails personDetails4 = null;
        AirlineReservationSystem.Person person5 = new AirlineReservationSystem.Person(personDetails4);
        AirlineReservationSystem.PersonDetails personDetails6 = person5.persnDet;
        AirlineReservationSystem.PersonDetails personDetails7 = person5.persnDet;
        AirlineReservationSystem.PersonDetails personDetails8 = null;
        AirlineReservationSystem.Person person9 = new AirlineReservationSystem.Person(personDetails8);
        AirlineReservationSystem.PersonDetails personDetails10 = null;
        person9.persnDet = personDetails10;
        AirlineReservationSystem.PersonDetails personDetails12 = person9.persnDet;
        AirlineReservationSystem.PersonDetails personDetails13 = null;
        person9.persnDet = personDetails13;
        AirlineReservationSystem.PersonDetails personDetails15 = null;
        person9.persnDet = personDetails15;
        AirlineReservationSystem.PersonDetails personDetails17 = person9.persnDet;
        AirlineReservationSystem.PersonDetails personDetails18 = null;
        AirlineReservationSystem.Person person19 = new AirlineReservationSystem.Person(personDetails18);
        AirlineReservationSystem.PersonDetails personDetails20 = null;
        person19.persnDet = personDetails20;
        AirlineReservationSystem.PersonDetails personDetails22 = person19.persnDet;
        AirlineReservationSystem.PersonDetails personDetails23 = null;
        person19.persnDet = personDetails23;
        AirlineReservationSystem.PersonDetails personDetails25 = null;
        AirlineReservationSystem.Person person26 = new AirlineReservationSystem.Person(personDetails25);
        AirlineReservationSystem.PersonDetails personDetails27 = null;
        person26.persnDet = personDetails27;
        AirlineReservationSystem.PersonDetails personDetails29 = person26.persnDet;
        AirlineReservationSystem.PersonDetails personDetails30 = null;
        person26.persnDet = personDetails30;
        AirlineReservationSystem.PersonDetails personDetails32 = null;
        AirlineReservationSystem.Person person33 = new AirlineReservationSystem.Person(personDetails32);
        AirlineReservationSystem.PersonDetails personDetails34 = null;
        AirlineReservationSystem.Person person35 = new AirlineReservationSystem.Person(personDetails34);
        AirlineReservationSystem.PersonDetails personDetails36 = null;
        person35.persnDet = personDetails36;
        AirlineReservationSystem.PersonDetails personDetails38 = person35.persnDet;
        AirlineReservationSystem.PersonDetails personDetails39 = null;
        person35.persnDet = personDetails39;
        AirlineReservationSystem.PersonDetails personDetails41 = null;
        person35.persnDet = personDetails41;
        AirlineReservationSystem.PersonDetails personDetails43 = person35.persnDet;
        AirlineReservationSystem.PersonDetails personDetails44 = null;
        AirlineReservationSystem.Person person45 = new AirlineReservationSystem.Person(personDetails44);
        AirlineReservationSystem.PersonDetails personDetails46 = null;
        person45.persnDet = personDetails46;
        AirlineReservationSystem.PersonDetails personDetails48 = null;
        person45.persnDet = personDetails48;
        AirlineReservationSystem.PersonDetails personDetails50 = null;
        person45.persnDet = personDetails50;
        AirlineReservationSystem.PersonDetails personDetails52 = person45.persnDet;
        AirlineReservationSystem.PersonDetails personDetails53 = null;
        AirlineReservationSystem.Person person54 = new AirlineReservationSystem.Person(personDetails53);
        AirlineReservationSystem.PersonDetails personDetails55 = null;
        person54.persnDet = personDetails55;
        AirlineReservationSystem.PersonDetails personDetails57 = person54.persnDet;
        AirlineReservationSystem.PersonDetails personDetails58 = null;
        person54.persnDet = personDetails58;
        AirlineReservationSystem.PersonDetails personDetails60 = null;
        AirlineReservationSystem.Person person61 = new AirlineReservationSystem.Person(personDetails60);
        AirlineReservationSystem.PersonDetails personDetails62 = null;
        person61.persnDet = personDetails62;
        AirlineReservationSystem.PersonDetails personDetails64 = null;
        person61.persnDet = personDetails64;
        AirlineReservationSystem.PersonDetails personDetails66 = null;
        person61.persnDet = personDetails66;
        AirlineReservationSystem.PersonDetails personDetails68 = null;
        AirlineReservationSystem.Person person69 = new AirlineReservationSystem.Person(personDetails68);
        AirlineReservationSystem.PersonDetails personDetails70 = null;
        AirlineReservationSystem.Person person71 = new AirlineReservationSystem.Person(personDetails70);
        AirlineReservationSystem.PersonDetails personDetails72 = null;
        person71.persnDet = personDetails72;
        AirlineReservationSystem.PersonDetails personDetails74 = null;
        person71.persnDet = personDetails74;
        AirlineReservationSystem.PersonDetails personDetails76 = null;
        person71.persnDet = personDetails76;
        AirlineReservationSystem.PersonDetails personDetails78 = person71.persnDet;
        AirlineReservationSystem.Person[] personArray79 = new AirlineReservationSystem.Person[] { person1, person5, person9, person19, person26, person33, person35, person45, person54, person61, person69, person71 };
        java.util.ArrayList<AirlineReservationSystem.Person> personList80 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList80, personArray79);
        // The following exception was thrown during execution in Person generation
        try {
            java.lang.Boolean boolean82 = AirlineReservationSystem.Person.IteratePersonObject(personList80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"sName\" because \"pObject.persnDet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(personDetails6);
        org.junit.Assert.assertNull(personDetails7);
        org.junit.Assert.assertNull(personDetails12);
        org.junit.Assert.assertNull(personDetails17);
        org.junit.Assert.assertNull(personDetails22);
        org.junit.Assert.assertNull(personDetails29);
        org.junit.Assert.assertNull(personDetails38);
        org.junit.Assert.assertNull(personDetails43);
        org.junit.Assert.assertNull(personDetails52);
        org.junit.Assert.assertNull(personDetails57);
        org.junit.Assert.assertNull(personDetails78);
        org.junit.Assert.assertNotNull(personArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void Person39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person39");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void Person40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Person40");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(10, 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }
    @Test
    public void FlightDetails01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails01");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setCapacity((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void FlightDetails02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails02");
        AirlineReservationSystem.FlightDetails.show_FlightDetails();
    }

    @Test
    public void FlightDetails03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails03");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sarrival_time = "";
        java.lang.String str8 = FlightDetails5.sto;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void FlightDetails04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails04");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("", "hi!", "", "hi!", (int) (byte) -1);
        java.lang.String str6 = FlightDetails5.sarrival_time;
        java.lang.String str7 = FlightDetails5.getDeparture_time();
        java.lang.String str8 = FlightDetails5.getFrom();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void FlightDetails05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails05");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("", "hi!", "", "hi!", (int) (byte) -1);
        java.lang.String str6 = FlightDetails5.sarrival_time;
        java.lang.String str7 = FlightDetails5.getDeparture_time();
        int int8 = FlightDetails5.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void FlightDetails06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails06");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sto = "hi!";
        FlightDetails5.setCapacity((int) (short) 100);
        java.lang.String str10 = FlightDetails5.sarrival_time;
        java.lang.String str11 = FlightDetails5.getArrival_time();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void FlightDetails07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails07");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setArrival_time("");
        FlightDetails5.setDeparture_time("hi!");
        FlightDetails5.sdeparture_time = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void FlightDetails08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails08");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setArrival_time("");
        FlightDetails5.setDeparture_time("hi!");
        FlightDetails5.sto = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void FlightDetails09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails09");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setArrival_time("");
        java.lang.String str9 = FlightDetails5.sarrival_time;
        FlightDetails5.setFrom("");
        FlightDetails5.setFrom("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void FlightDetails10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails10");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sto = "hi!";
        FlightDetails5.setArrival_time("hi!");
        FlightDetails5.sarrival_time = "";
    }

    @Test
    public void FlightDetails11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails11");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setArrival_time("");
        java.lang.String str9 = FlightDetails5.sarrival_time;
        java.lang.Class<?> wildcardClass10 = FlightDetails5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void FlightDetails12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails12");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sto = "hi!";
        FlightDetails5.setArrival_time("");
        java.lang.String str10 = FlightDetails5.getArrival_time();
        FlightDetails5.sfrom = "hi!";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void FlightDetails13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails13");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sdeparture_time = "";
        FlightDetails5.setCapacity((int) (short) 1);
        FlightDetails5.setFrom("");
        FlightDetails5.setDeparture_time("hi!");
        FlightDetails5.sto = "hi!";
    }

    @Test
    public void FlightDetails14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails14");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sto = "hi!";
        FlightDetails5.setArrival_time("");
        java.lang.String str10 = FlightDetails5.sto;
        java.lang.String str11 = FlightDetails5.getArrival_time();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void FlightDetails15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails15");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setArrival_time("");
        java.lang.String str9 = FlightDetails5.sarrival_time;
        java.lang.String str10 = FlightDetails5.getFrom();
        java.lang.String str11 = FlightDetails5.getTo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void FlightDetails16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails16");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("", "hi!", "", "hi!", (int) (byte) -1);
        java.lang.String str6 = FlightDetails5.sarrival_time;
        java.lang.String str7 = FlightDetails5.getDeparture_time();
        int int8 = FlightDetails5.ncapacity;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void FlightDetails17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails17");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setDeparture_time("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void FlightDetails18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails18");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sdeparture_time = "";
        FlightDetails5.setCapacity((int) (short) 1);
        java.lang.String str10 = FlightDetails5.getFrom();
        java.lang.String str11 = FlightDetails5.sfrom;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void FlightDetails19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails19");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sdeparture_time = "";
        FlightDetails5.setCapacity((int) (short) 1);
        java.lang.String str10 = FlightDetails5.getFrom();
        java.lang.String str11 = FlightDetails5.getTo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void FlightDetails20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails20");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setArrival_time("");
        java.lang.String str9 = FlightDetails5.sarrival_time;
        java.lang.String str10 = FlightDetails5.getFrom();
        java.lang.String str11 = FlightDetails5.sdeparture_time;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void FlightDetails21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails21");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("", "hi!", "", "hi!", (int) (byte) -1);
        java.lang.String str6 = FlightDetails5.sarrival_time;
        java.lang.String str7 = FlightDetails5.sdeparture_time;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void FlightDetails22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails22");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sdeparture_time = "";
        int int8 = FlightDetails5.ncapacity;
        java.lang.String str9 = FlightDetails5.getDeparture_time();
        java.lang.String str10 = FlightDetails5.sfrom;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void FlightDetails23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails23");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        FlightDetails5.sto = "hi!";
        java.lang.String str8 = FlightDetails5.sfrom;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void FlightDetails24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FlightDetails24");
        AirlineReservationSystem.FlightDetails FlightDetails5 = new AirlineReservationSystem.FlightDetails("hi!", "", "hi!", "", (int) 'a');
        java.lang.String str6 = FlightDetails5.sto;
        FlightDetails5.setArrival_time("");
        java.lang.String str9 = FlightDetails5.sarrival_time;
        FlightDetails5.setFrom("");
        FlightDetails5.setArrival_time("hi!");
        FlightDetails5.setFrom("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }
    @Test
    public void ProjectDB01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB01");
        AirlineReservationSystem.FlightDetails FlightDetails0 = null;
        java.lang.Boolean boolean1 = AirlineReservationSystem.ProjectDB.insert(FlightDetails0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void ProjectDB02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB02");
        AirlineReservationSystem.Person person0 = null;
        java.lang.Boolean boolean1 = AirlineReservationSystem.ProjectDB.insert(person0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void ProjectDB03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB03");
        AirlineReservationSystem.PassengerDetails passengerDetails0 = null;
        java.lang.Boolean boolean1 = AirlineReservationSystem.ProjectDB.insert(passengerDetails0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void ProjectDB04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB04");
        java.util.ArrayList<AirlineReservationSystem.Person> personList0 = AirlineReservationSystem.ProjectDB.personlst;
        java.lang.Class<?> wildcardClass1 = personList0.getClass();
        org.junit.Assert.assertNotNull(personList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ProjectDB05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB05");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        java.lang.Class<?> wildcardClass1 = flightSchedulerList0.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ProjectDB06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB06");
        java.util.ArrayList<AirlineReservationSystem.FlightDetails> FlightDetailsList0 = null;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList0;
    }

    @Test
    public void ProjectDB07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB07");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        java.lang.Class<?> wildcardClass4 = passengerDetailsList1.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ProjectDB08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB08");
        AirlineReservationSystem.FlightScheduler flightScheduler0 = null;
        java.lang.Boolean boolean1 = AirlineReservationSystem.ProjectDB.insert(flightScheduler0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void ProjectDB09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB09");
        java.util.ArrayList<AirlineReservationSystem.FlightDetails> FlightDetailsList0 = AirlineReservationSystem.ProjectDB.flightdetlst;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList0;
        org.junit.Assert.assertNull(FlightDetailsList0);
    }

    @Test
    public void ProjectDB10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB10");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        java.lang.Class<?> wildcardClass5 = passengerDetailsList1.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ProjectDB11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB11");
        AirlineReservationSystem.Person[] personArray0 = new AirlineReservationSystem.Person[] {};
        java.util.ArrayList<AirlineReservationSystem.Person> personList1 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList1, personArray0);
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        java.lang.Class<?> wildcardClass4 = personList1.getClass();
        org.junit.Assert.assertNotNull(personArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ProjectDB12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB12");
        java.util.ArrayList<AirlineReservationSystem.Person> personList0 = AirlineReservationSystem.ProjectDB.personlst;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        java.lang.Class<?> wildcardClass2 = personList0.getClass();
        org.junit.Assert.assertNotNull(personList0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ProjectDB13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB13");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        java.lang.Class<?> wildcardClass3 = flightSchedulerList0.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerList0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ProjectDB14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB14");
        AirlineReservationSystem.ProjectDB projectDB0 = new AirlineReservationSystem.ProjectDB();
        java.lang.Class<?> wildcardClass1 = projectDB0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ProjectDB15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB15");
        AirlineReservationSystem.FlightDetails[] FlightDetailsArray0 = new AirlineReservationSystem.FlightDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightDetails> FlightDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.FlightDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightDetails>) FlightDetailsList1, FlightDetailsArray0);
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        java.lang.Class<?> wildcardClass6 = FlightDetailsList1.getClass();
        org.junit.Assert.assertNotNull(FlightDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ProjectDB16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB16");
        AirlineReservationSystem.Person[] personArray0 = new AirlineReservationSystem.Person[] {};
        java.util.ArrayList<AirlineReservationSystem.Person> personList1 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList1, personArray0);
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        java.lang.Class<?> wildcardClass6 = personList1.getClass();
        org.junit.Assert.assertNotNull(personArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ProjectDB17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB17");
        AirlineReservationSystem.FlightScheduler[] flightSchedulerArray0 = new AirlineReservationSystem.FlightScheduler[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList1 = new java.util.ArrayList<AirlineReservationSystem.FlightScheduler>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightScheduler>) flightSchedulerList1, flightSchedulerArray0);
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        java.lang.Class<?> wildcardClass6 = flightSchedulerList1.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ProjectDB18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB18");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        java.lang.Class<?> wildcardClass5 = flightSchedulerList0.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerList0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ProjectDB19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB19");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        java.lang.Class<?> wildcardClass2 = flightSchedulerList0.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerList0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ProjectDB20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB20");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        java.lang.Class<?> wildcardClass7 = passengerDetailsList1.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ProjectDB21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB21");
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList0 = AirlineReservationSystem.ProjectDB.passengerlst;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        java.lang.Class<?> wildcardClass4 = passengerDetailsList0.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsList0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ProjectDB22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB22");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        java.lang.Class<?> wildcardClass6 = flightSchedulerList0.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerList0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ProjectDB23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB23");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = null;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
    }

    @Test
    public void ProjectDB24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB24");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        // The following exception was thrown during execution in ProjectDB generation
        try {
            java.lang.Class<?> wildcardClass7 = flightSchedulerList0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(flightSchedulerList0);
    }

    @Test
    public void ProjectDB25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB25");
        AirlineReservationSystem.Person[] personArray0 = new AirlineReservationSystem.Person[] {};
        java.util.ArrayList<AirlineReservationSystem.Person> personList1 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList1, personArray0);
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        java.lang.Class<?> wildcardClass5 = personList1.getClass();
        org.junit.Assert.assertNotNull(personArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ProjectDB26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB26");
        java.util.ArrayList<AirlineReservationSystem.Person> personList0 = AirlineReservationSystem.ProjectDB.personlst;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        java.lang.Class<?> wildcardClass3 = personList0.getClass();
        org.junit.Assert.assertNotNull(personList0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ProjectDB27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB27");
        java.util.ArrayList<AirlineReservationSystem.FlightDetails> FlightDetailsList0 = AirlineReservationSystem.ProjectDB.flightdetlst;
        java.lang.Class<?> wildcardClass1 = FlightDetailsList0.getClass();
        org.junit.Assert.assertNotNull(FlightDetailsList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ProjectDB28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB28");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
// flaky:         org.junit.Assert.assertNotNull(flightSchedulerList0);
    }

    @Test
    public void ProjectDB29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB29");
        java.util.ArrayList<AirlineReservationSystem.Person> personList0 = null;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
    }

    @Test
    public void ProjectDB30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB30");
        AirlineReservationSystem.FlightScheduler[] flightSchedulerArray0 = new AirlineReservationSystem.FlightScheduler[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList1 = new java.util.ArrayList<AirlineReservationSystem.FlightScheduler>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightScheduler>) flightSchedulerList1, flightSchedulerArray0);
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        java.lang.Class<?> wildcardClass9 = flightSchedulerList1.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ProjectDB31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB31");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        java.lang.Class<?> wildcardClass4 = flightSchedulerList0.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerList0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ProjectDB32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB32");
        AirlineReservationSystem.FlightDetails[] FlightDetailsArray0 = new AirlineReservationSystem.FlightDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightDetails> FlightDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.FlightDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightDetails>) FlightDetailsList1, FlightDetailsArray0);
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        java.lang.Class<?> wildcardClass7 = FlightDetailsList1.getClass();
        org.junit.Assert.assertNotNull(FlightDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ProjectDB33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB33");
        AirlineReservationSystem.FlightScheduler[] flightSchedulerArray0 = new AirlineReservationSystem.FlightScheduler[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList1 = new java.util.ArrayList<AirlineReservationSystem.FlightScheduler>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightScheduler>) flightSchedulerList1, flightSchedulerArray0);
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        java.lang.Class<?> wildcardClass4 = flightSchedulerList1.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ProjectDB34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB34");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        java.lang.Class<?> wildcardClass6 = passengerDetailsList1.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ProjectDB35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB35");
        AirlineReservationSystem.FlightScheduler[] flightSchedulerArray0 = new AirlineReservationSystem.FlightScheduler[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList1 = new java.util.ArrayList<AirlineReservationSystem.FlightScheduler>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightScheduler>) flightSchedulerList1, flightSchedulerArray0);
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        java.lang.Class<?> wildcardClass5 = flightSchedulerList1.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ProjectDB36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB36");
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList0 = AirlineReservationSystem.ProjectDB.flightSchedulerlst;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList0;
        java.lang.Class<?> wildcardClass8 = flightSchedulerList0.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerList0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ProjectDB37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB37");
        AirlineReservationSystem.FlightScheduler[] flightSchedulerArray0 = new AirlineReservationSystem.FlightScheduler[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList1 = new java.util.ArrayList<AirlineReservationSystem.FlightScheduler>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightScheduler>) flightSchedulerList1, flightSchedulerArray0);
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        java.lang.Class<?> wildcardClass7 = flightSchedulerList1.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ProjectDB38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB38");
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList0 = null;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
    }

    @Test
    public void ProjectDB39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB39");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ProjectDB40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB40");
        AirlineReservationSystem.Person[] personArray0 = new AirlineReservationSystem.Person[] {};
        java.util.ArrayList<AirlineReservationSystem.Person> personList1 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList1, personArray0);
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        org.junit.Assert.assertNotNull(personArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ProjectDB41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB41");
        AirlineReservationSystem.FlightDetails[] FlightDetailsArray0 = new AirlineReservationSystem.FlightDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightDetails> FlightDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.FlightDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightDetails>) FlightDetailsList1, FlightDetailsArray0);
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        org.junit.Assert.assertNotNull(FlightDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ProjectDB42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB42");
        AirlineReservationSystem.FlightDetails[] FlightDetailsArray0 = new AirlineReservationSystem.FlightDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightDetails> FlightDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.FlightDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightDetails>) FlightDetailsList1, FlightDetailsArray0);
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        AirlineReservationSystem.ProjectDB.flightdetlst = FlightDetailsList1;
        java.lang.Class<?> wildcardClass5 = FlightDetailsList1.getClass();
        org.junit.Assert.assertNotNull(FlightDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ProjectDB43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB43");
        AirlineReservationSystem.Person[] personArray0 = new AirlineReservationSystem.Person[] {};
        java.util.ArrayList<AirlineReservationSystem.Person> personList1 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList1, personArray0);
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        AirlineReservationSystem.ProjectDB.personlst = personList1;
        java.lang.Class<?> wildcardClass7 = personList1.getClass();
        org.junit.Assert.assertNotNull(personArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ProjectDB44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB44");
        java.util.ArrayList<AirlineReservationSystem.Person> personList0 = AirlineReservationSystem.ProjectDB.personlst;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        org.junit.Assert.assertNotNull(personList0);
    }

    @Test
    public void ProjectDB45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB45");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        java.lang.Class<?> wildcardClass8 = passengerDetailsList1.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ProjectDB46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB46");
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList0 = AirlineReservationSystem.ProjectDB.passengerlst;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        java.lang.Class<?> wildcardClass2 = passengerDetailsList0.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsList0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ProjectDB47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB47");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList1;
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ProjectDB48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB48");
        AirlineReservationSystem.FlightScheduler[] flightSchedulerArray0 = new AirlineReservationSystem.FlightScheduler[] {};
        java.util.ArrayList<AirlineReservationSystem.FlightScheduler> flightSchedulerList1 = new java.util.ArrayList<AirlineReservationSystem.FlightScheduler>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.FlightScheduler>) flightSchedulerList1, flightSchedulerArray0);
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        AirlineReservationSystem.ProjectDB.flightSchedulerlst = flightSchedulerList1;
        java.lang.Class<?> wildcardClass11 = flightSchedulerList1.getClass();
        org.junit.Assert.assertNotNull(flightSchedulerArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void ProjectDB49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB49");
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList0 = AirlineReservationSystem.ProjectDB.passengerlst;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        AirlineReservationSystem.ProjectDB.passengerlst = passengerDetailsList0;
        org.junit.Assert.assertNotNull(passengerDetailsList0);
    }

    @Test
    public void ProjectDB50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ProjectDB50");
        java.util.ArrayList<AirlineReservationSystem.Person> personList0 = AirlineReservationSystem.ProjectDB.personlst;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        AirlineReservationSystem.ProjectDB.personlst = personList0;
        java.lang.Class<?> wildcardClass4 = personList0.getClass();
        org.junit.Assert.assertNotNull(personList0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }


    @Test
    public void PassengerDetails01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails01");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails02");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails03");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails04");
        AirlineReservationSystem.Person.showPersonTable();
    }

    @Test
    public void PassengerDetails05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails05");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails06");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails07");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Class<?> wildcardClass4 = passengerDetailsList1.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void PassengerDetails08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails08");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) 'a', 1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails09");
        AirlineReservationSystem.PassengerDetails.show_PassengerDetails();
    }

    @Test
    public void PassengerDetails10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails10");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails11");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails12");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails13");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails14");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList4 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = passengerDetailsList1.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(passengerDetailsList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void PassengerDetails15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails15");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber(0);
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void PassengerDetails16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails16");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails17");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails18");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails19");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails20");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails21");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList4 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = passengerDetailsList4.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(passengerDetailsList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void PassengerDetails22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails22");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber((int) 'a');
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void PassengerDetails23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails23");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails24");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails25");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails26");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails27");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails28");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) '4', 10);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails29");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails30");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails31");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean4 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList6 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, 10);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList8 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(passengerDetailsList6);
        org.junit.Assert.assertNotNull(passengerDetailsList8);
    }

    @Test
    public void PassengerDetails32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails32");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails33");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails34");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber((int) ' ');
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void PassengerDetails35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails35");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void PassengerDetails36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails36");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails37");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean4 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList6 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, 10);
        java.lang.Boolean boolean7 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList6);
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(passengerDetailsList6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void PassengerDetails38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails38");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails39");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    	AirLineApp.input = new Scanner("5\n3\n");
    	AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner("-1\n8\n3\n");
		AirLineApp.printFlightsMenuUI();
    }

    @Test
    public void PassengerDetails40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails40");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber(10);
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void PassengerDetails41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails41");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails42");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean4 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Class<?> wildcardClass5 = passengerDetailsList1.getClass();
        AirlineReservationSystem.AirLineApp.printHeadUI();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        AirlineReservationSystem.AirLineApp.FilinDetails();
    
		AirLineApp.input = new Scanner("7\n3\n");
		org.junit.Assert.assertTrue(AirLineApp.choicePassengerUI(2));
		AirLineApp.input = new Scanner("7\n1\n7\n3\n");
		org.junit.Assert.assertTrue(AirLineApp.choicePassengerUI(3));
		AirLineApp.input = new Scanner("9\n7\n3\n");
		org.junit.Assert.assertFalse(AirLineApp.choicePassengerUI(8));
		org.junit.Assert.assertFalse(AirLineApp.choicePassengerUI(9));
		org.junit.Assert.assertTrue(AirLineApp.choicePassengerUI(5));
		AirLineApp.input = new Scanner("8\n3\n");
		org.junit.Assert.assertTrue(AirLineApp.flightMenuChoice(2));
		AirLineApp.input = new Scanner("8\n3\n");
		org.junit.Assert.assertTrue(AirLineApp.flightMenuChoice(5));
		AirLineApp.input = new Scanner("1\n8\n3\n");
		org.junit.Assert.assertTrue(AirLineApp.flightMenuChoice(7));
		AirLineApp.input = new Scanner("8\n3\n");
		org.junit.Assert.assertTrue(AirLineApp.flightMenuChoice(9));
		org.junit.Assert.assertFalse(AirLineApp.choicePassengerUI(8));
		AirlineReservationSystem.AirLineApp.FilinDetails();
		AirLineApp.input = new Scanner("a\nb\nc\nd\n5\n8\n3\n");		
		org.junit.Assert.assertTrue(AirLineApp.flightMenuChoice(1));
		AirLineApp.input = new Scanner("8\n3\n");		
		org.junit.Assert.assertTrue(AirLineApp.flightMenuChoice(8));
		org.junit.Assert.assertFalse(AirLineApp.flightMenuChoice(10));
		
		AirLineApp.input = new Scanner("1\n7\n3\n");
		org.junit.Assert.assertTrue(AirLineApp.choicePassengerUI(6));
		
		AirLineApp.input = new Scanner("H\nA\n3\n2\n7\n3\n");
		org.junit.Assert.assertTrue(AirLineApp.choicePassengerUI(1));
		
		//====================
		AirLineApp.FilinDetails();
		//AirlineReservationSystem.ProjectDB.personlst.add(AirLineApp.g_per);
		org.junit.Assert.assertTrue(AirlineReservationSystem.ProjectDB.passengerlst.add(AirLineApp.g_perobj));
		org.junit.Assert.assertTrue(AirlineReservationSystem.ProjectDB.flightdetlst.add(AirLineApp.g_fd));
		org.junit.Assert.assertTrue(AirlineReservationSystem.ProjectDB.flightSchedulerlst.add(AirLineApp.g_sch));
		org.junit.Assert.assertFalse(AirlineReservationSystem.ProjectDB.insert(AirLineApp.g_per));
		org.junit.Assert.assertTrue(AirlineReservationSystem.ProjectDB.insert(AirLineApp.g_perobj));
		org.junit.Assert.assertTrue(AirlineReservationSystem.ProjectDB.insert(AirLineApp.g_fd));
		org.junit.Assert.assertTrue(AirlineReservationSystem.ProjectDB.insert(AirLineApp.g_perobj));
		
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void PassengerDetails43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails43");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails44");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails45");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails46");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(100, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails47");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails48");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails49");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(1, 10);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails50");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails51");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails52");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList5 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(passengerDetailsList5);
    }

    @Test
    public void PassengerDetails53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails53");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean4 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean5 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean6 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Class<?> wildcardClass7 = passengerDetailsList1.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void PassengerDetails54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails54");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }


    @Test
    public void PassengerDetails56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails56");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails57");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void PassengerDetails58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails58");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails59");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList5 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) '4');
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(passengerDetailsList5);
    }

    @Test
    public void PassengerDetails60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails60");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean4 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean5 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList7 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) 'a');
        java.lang.Class<?> wildcardClass8 = passengerDetailsList7.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(passengerDetailsList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void PassengerDetails61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails61");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails62");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails63");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails64");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails65");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList4 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) (short) -1);
        java.lang.Boolean boolean5 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(passengerDetailsList4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void PassengerDetails66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails66");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showHeaderLine((int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails67");
        AirlineReservationSystem.Person[] personArray0 = new AirlineReservationSystem.Person[] {};
        java.util.ArrayList<AirlineReservationSystem.Person> personList1 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList1, personArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.Person.IteratePersonObject(personList1);
        java.lang.Boolean boolean4 = AirlineReservationSystem.Person.IteratePersonObject(personList1);
        java.lang.Boolean boolean5 = AirlineReservationSystem.Person.IteratePersonObject(personList1);
        java.lang.Class<?> wildcardClass6 = personList1.getClass();
        org.junit.Assert.assertNotNull(personArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void PassengerDetails68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails68");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine((-1), 0);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void PassengerDetails69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails69");
        java.lang.Boolean boolean2 = AirlineReservationSystem.Person.showBodyLine(100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void PassengerDetails70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails70");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList4 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) (short) -1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList6 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) '4');
        java.lang.Class<?> wildcardClass7 = passengerDetailsList6.getClass();
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(passengerDetailsList4);
        org.junit.Assert.assertNotNull(passengerDetailsList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void PassengerDetails71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails71");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList4 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) (short) -1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList6 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) '4');
        java.lang.Boolean boolean7 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList6);
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(passengerDetailsList4);
        org.junit.Assert.assertNotNull(passengerDetailsList6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void PassengerDetails72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails72");
        AirlineReservationSystem.Person[] personArray0 = new AirlineReservationSystem.Person[] {};
        java.util.ArrayList<AirlineReservationSystem.Person> personList1 = new java.util.ArrayList<AirlineReservationSystem.Person>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.Person>) personList1, personArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.Person.IteratePersonObject(personList1);
        java.lang.Boolean boolean4 = AirlineReservationSystem.Person.IteratePersonObject(personList1);
        java.lang.Boolean boolean5 = AirlineReservationSystem.Person.IteratePersonObject(personList1);
        java.lang.Boolean boolean6 = AirlineReservationSystem.Person.IteratePersonObject(personList1);
        org.junit.Assert.assertNotNull(personArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void PassengerDetails73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails73");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean4 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.lang.Boolean boolean5 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList7 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (-1));
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(passengerDetailsList7);
    }

    @Test
    public void PassengerDetails74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails74");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber((int) (byte) -1);
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void PassengerDetails75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails75");
        int int1 = AirlineReservationSystem.PassengerDetails.getSCFlightPassengersCount((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void PassengerDetails76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails76");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void PassengerDetails77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails77");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList5 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, 0);
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(passengerDetailsList5);
    }

    @Test
    public void PassengerDetails78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails78");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void PassengerDetails79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails79");
        java.util.List list1 = AirlineReservationSystem.PassengerDetails.showFlightNumber(1);
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void PassengerDetails80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails80");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        AirlineReservationSystem.AirLineApp.printHeadUI();
        AirlineReservationSystem.FlightScheduler.generateFlightNumber();
        AirlineReservationSystem.FlightScheduler.showFlightSchedulerTable();
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.lang.Boolean boolean3 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList1);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList5 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, 1);
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(passengerDetailsList5);
    }

    @Test
    public void PassengerDetails81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails81");
        AirlineReservationSystem.PassengerDetails[] passengerDetailsArray0 = new AirlineReservationSystem.PassengerDetails[] {};
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList1 = new java.util.ArrayList<AirlineReservationSystem.PassengerDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<AirlineReservationSystem.PassengerDetails>) passengerDetailsList1, passengerDetailsArray0);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList4 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList1, (int) (short) -1);
        java.lang.Boolean boolean5 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList4);
        java.lang.Boolean boolean6 = AirlineReservationSystem.PassengerDetails.printPassengerDetails(passengerDetailsList4);
        java.util.ArrayList<AirlineReservationSystem.PassengerDetails> passengerDetailsList8 = AirlineReservationSystem.PassengerDetails.insertPassengerList(passengerDetailsList4, (int) 'a');
        org.junit.Assert.assertNotNull(passengerDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(passengerDetailsList4);
        
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(passengerDetailsList8);
    }

    @Test
    public void PassengerDetails82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.PassengerDetails82");
        AirlineReservationSystem.Person person0 = null;
        // The following exception was thrown during execution in PassengerDetails generation
        try {
            AirlineReservationSystem.PassengerDetails passengerDetails2 = new AirlineReservationSystem.PassengerDetails(person0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"persnDet\" because \"perObj\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
    @Test
    public void AirLineApp1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.AirLineApp1");
        java.util.Scanner scanner0 = AirlineReservationSystem.AirLineApp.input;
        AirlineReservationSystem.AirLineApp.input = scanner0;
        org.junit.Assert.assertNotNull(scanner0);
// flaky:         org.junit.Assert.assertEquals(scanner0.toString(), "java.util.Scanner[delimiters=\\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\\x{2c}][decimal separator=\\x{2e}][positive prefix=][negative prefix=\\Q-\\E][positive suffix=][negative suffix=][NaN string=\\QNaN\\E][infinity string=\\\u221e\\E]");
    }

    @Test
    public void AirLineApp2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.AirLineApp2");
// flaky:  AirlineReservationSystem.AirLineApp.printFlightsMenuUI();
    }

    @Test
    public void AirLineApp3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.AirLineApp3");
        boolean boolean1 = AirlineReservationSystem.AirLineApp.choicePassengerUI((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void AirLineApp4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.AirLineApp4");
        AirlineReservationSystem.AirLineApp airLineApp0 = new AirlineReservationSystem.AirLineApp();
    }

    @Test
    public void AirLineApp5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.AirLineApp5");
// flaky:         AirlineReservationSystem.AirLineApp.printPassengerUI();
    }
   }

