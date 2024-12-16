package com.group.libraryapp.calculator

data class Calculator ( // TODO data class 특징
    private var number: Int
) {
    // TODO Backing Properties

    fun add(operand: Int) {
        this.number += operand
    }

    fun minus(operand: Int) {
        this.number -= operand
    }

    fun multiply(operand: Int) {
        this.number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("Division by zero")
        }

        this.number /= operand
    }
}