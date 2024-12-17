package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()

    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divTest()
    calculatorTest.divExceptionTest()
}

class CalculatorTest {

    fun addTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        if (calculator.number != 8) {
            throw IllegalStateException()
        }
    }

    fun minusTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(3)

        // then
        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        if (calculator.number != 15) {
            throw IllegalStateException()
        }
    }

    fun divTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }


    fun divExceptionTest() {
        // given
        val calculator = Calculator(5)

        // when
        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            if (e.message != "Division by zero") {
                throw IllegalStateException("메시지가 다름")
            }
            // 테스트 성공
            return
        } catch (e: Exception) {
            throw IllegalStateException()
        }

        throw IllegalStateException("예상하는 예외가 발생하지 않음")
    }

}