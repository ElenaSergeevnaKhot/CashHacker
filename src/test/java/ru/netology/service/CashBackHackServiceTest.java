package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashBackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback1() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback2() {
        CashBackHackService service = new CashBackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashback3() {
        CashBackHackService service = new CashBackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}