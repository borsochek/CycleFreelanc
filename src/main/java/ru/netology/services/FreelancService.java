package ru.netology.services;

public class FreelancService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (money < threshold) {
                money += income;
                money -= expenses;
            } else {
                money -= expenses;
                money /= 3;
                counter++;
            }
        }
        return counter;
    }
}
