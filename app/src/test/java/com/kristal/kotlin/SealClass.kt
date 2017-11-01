package com.kristal.kotlin

/**
 * Created by Dwi_Ari on 11/1/17.
 */

sealed class SealClass
data class Const(val number: Double) : SealClass()
data class Sum(val e1: SealClass, val e2: SealClass) : SealClass()
object NotANumber : SealClass()

fun eval(expr: SealClass): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
// the `else` clause is not required because we've covered all the cases
}