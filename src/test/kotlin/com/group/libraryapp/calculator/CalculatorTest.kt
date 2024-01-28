package com.group.library.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}
class CalculatorTest {

    fun addTest() {

        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        val experctedCal = Calculator(8)
        if (experctedCal.number != calculator.number) { // Test Code를 확인하는 방법2: public number 이용
            throw IllegalStateException()
        }

    }

    fun minusTest() {

        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(2)

        // then
        val experctedCal = Calculator(3)
        if (experctedCal.number != calculator.number) { // Test Code를 확인하는 방법2: public number 이용
            throw IllegalStateException()
        }

    }

    fun multiplyTest() {

        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(2)

        // then
        val experctedCal = Calculator(10)
        if (experctedCal.number != calculator.number) { // Test Code를 확인하는 방법2: public number 이용
            throw IllegalStateException()
        }

    }

    fun divideTest() {

        // given
        val calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        if (calculator.number != 2) { // Test Code를 확인하는 방법2: public number 이용
            throw IllegalStateException()
        }

    }

    fun divideExceptionTest() {

        //given
        val calculator = Calculator(5)

        // when
        try {
            calculator.divide(0)
        } catch(e: IllegalArgumentException) {
            if (e.message != "0으로 나눌 수 없습니다.")
                throw IllegalStateException("메세지가 다릅니다.") // class에 있는 에러 메세지와 다른 경우 exception
            // 테스트 성공 !!
            return
        } catch(e: Exception) {
            throw IllegalStateException()
        }
        throw IllegalStateException("거대하는 예외가 발생하지 않았습니다.")
        //then
    }
}