package com.group.library.calculator

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class JunitCalculatorTest {

    @Test
    fun addTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(1)

        // then
        assertThat(calculator.number).isEqualTo(6)

        // assertThat(확인하고 싶은 값)
        // isEqualTo(기대값)

    }

    @Test
    fun minusTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(1)

        // then
        assertThat(calculator.number).isEqualTo(4)

        // assertThat(확인하고 싶은 값)
        // isEqualTo(기대값)

    }

    @Test
    fun multiplyTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        assertThat(calculator.number).isEqualTo(15)

        // assertThat(확인하고 싶은 값)
        // isEqualTo(기대값)

    }

    @Test
    fun divideTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        assertThat(calculator.number).isEqualTo(2)

        // assertThat(확인하고 싶은 값)
        // isEqualTo(기대값)

    }

    @Test
    fun divideExceptionTest() {

        val calculator = Calculator(5)

        val message = assertThrows<IllegalArgumentException> {
            calculator.divide(0)
        }.message

        assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")
    }
}