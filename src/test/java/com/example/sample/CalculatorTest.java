package com.example.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

// ctrl shift R => 커서레벨 테스트 실행 단축키
public class CalculatorTest {
    @Test
    public void 덧셈_연산을_할_수_있다() {
        //given
        // 필요한 값 미리 만들어둠
        long num1 = 2;
        String operator = "+";
        long num2 = 3;
        Calculator calculator = new Calculator();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(5, result); // junit assertion
//        assertThat(result).isEqualTo(5); // assertj assertion
    }
    @Test
    public void 곱셈_연산을_할_수_있다() {
        //given
        long num1 = 2;
        String operator = "*";
        long num2 = 3;

        Calculator calculator = new Calculator();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(6, result);
    }

    @Test
    public void 뺄셈_연산을_할_수_있다() {
        //given
        long num1 = 2;
        String operator = "-";
        long num2 = 3;

        Calculator calculator = new Calculator();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(-1, result);
    }

    @Test
    public void 나눗셈_연산을_할_수_있다() {
        //given
        long num1 = 6;
        String operator = "/";
        long num2 = 3;

        Calculator calculator = new Calculator();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(2, result);
    }

    @Test
    public void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
        //given
        long num1 = 6;
        String operator = "x";
        long num2 = 3;

        Calculator calculator = new Calculator();

        //when
        //then
        assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });
    }
}
