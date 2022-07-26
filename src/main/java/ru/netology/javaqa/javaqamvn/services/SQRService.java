package ru.netology.javaqa.javaqamvn.services;

public class SQRService {


    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int sqrt = i * i;
            if ((sqrt >= min) && (sqrt <= max)) {
                count++;
            }
        }
        return count;
    }
}
