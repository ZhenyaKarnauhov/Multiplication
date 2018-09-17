package ru.kev.multiplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP on 08.09.2018.
 * 08.09.2018
 *
 * @author Карнаухов Евгений 15ИТ18.
 */
public class MultiplicationTest {
    @Test
    public void main() throws Exception {
        Multiplication multiplication = new Multiplication();
        assertEquals(3456789,multiplication.result(4,45678));
    }

}