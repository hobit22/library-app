package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()

    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
}

class CalculatorTest {

    fun addTest() {
        // given
        val calculator = Calculator(5)
        calculator.add(3)

        // when
        val expectedCalculator = Calculator(8)

        // then
        if (calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }

    fun minusTest() {
        // given
        val calculator = Calculator(5)
        calculator.minus(3)

        // when
        val expectedCalculator = Calculator(2)

        // then
        if (calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {
        // given
        val calculator = Calculator(5)
        calculator.multiply(3)

        // when
        val expectedCalculator = Calculator(15)

        // then
        if (calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }

}