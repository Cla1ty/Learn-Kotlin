package com.kristal.kotlin

import com.kristal.kotlin.base.vegetables
import org.junit.Test

/**
 * Created by Dwi_Ari on 11/1/17.
 */

class Expression {
    @Test
    fun inList() {
        when {
            "orange" in vegetables -> println("juicy")
            "apple" in vegetables -> println("apple is fine too")
        }
    }

    fun checkInstance() {
        var x: Any? = null
        when (x) {
            is String -> {
            }
            is Int -> {
            }
            is Boolean -> {
            }
            is Float -> {
            }
            else -> {
            }
        }
    }

    fun anyObject() {
        val obj: Any? = null
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
    }

    fun singleLine() {
        val a = 0
        val b = 0
        if (a > b) a else b
    }

    fun multi() {
        val x = 0
        when (x) {
            0, 1 -> print("x == 0 or x == 1")
            else -> print("otherwise")
        }

        when (x) {
            in 1..10 -> print("x is in the range")
//            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }
}