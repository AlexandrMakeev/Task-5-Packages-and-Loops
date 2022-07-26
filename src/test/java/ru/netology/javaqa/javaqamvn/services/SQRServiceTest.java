package ru.netology.javaqa.javaqamvn.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {


    @Test
    public void test1() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 1000);
        int expected = 17;
        assertEquals(expected, actual);
    }


}


