package com.example.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

class CalculationRequestReaderTest {
    @Test
    public void System_in으로_데이터를_읽어들일_수_있다() {
        //given
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();

        //when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes())); // 사용자 입력을 넣어주는 것처럼 동작하게 한다
        CalculationRequest result = calculationRequestReader.read();

        //then
        assertEquals(2, result.getNum1());
        assertEquals("+", result.getOperator());
        assertEquals(3, result.getNum2());
    }
}