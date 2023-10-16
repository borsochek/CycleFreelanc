package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelancService;

import static org.junit.jupiter.api.Assertions.*;

class FreelancServiceTest {
    @Test
    public void CalculateCase1() {
        FreelancService service = new FreelancService();
        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

        @Test
        public void CalculateCase2() {
            FreelancService service = new FreelancService();
            int expected = 2;
            int actual = service.calculate(100_000, 60_000, 150_000);
            Assertions.assertEquals(expected, actual);

    }

}