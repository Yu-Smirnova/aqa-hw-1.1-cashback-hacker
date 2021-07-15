package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemainUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 418;

        int actual =service.remain(582);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainOver1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 707;

        int actual =service.remain(1293);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhen0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;

        int actual =service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhen999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;

        int actual =service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhen1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;

        int actual =service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhen1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;

        int actual =service.remain(1001);
        assertEquals(actual, expected);
    }

}