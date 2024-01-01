package com.group.library.calculator

// data class Calculator ( -- Test Code를 확인하는 방법1: data class를 활용해서
class Calculator (
        private var _number: Int
) {

    val number: Int
        get() = this._number // Test Code를 확인하는 방법3: getter

    fun add(operand: Int) {
        this._number += operand
    }

    fun minus(operand: Int) {
        this._number -= operand
    }

    fun multiply(operand: Int) {
        this._number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다.") }
        this._number /= operand
    }

}