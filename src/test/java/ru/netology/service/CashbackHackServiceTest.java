package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainValue0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue444() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3333;
        int actual = service.remain(amount);
        int expected = 667;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue888() {
        CashbackHackService service = new CashbackHackService();
        int amount = 98;
        int actual = service.remain(amount);
        int expected = 902;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = -234;
        int actual = service.remain(amount);
        int expected = 1234;
        assertEquals(actual, expected);
    }
}