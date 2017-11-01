package com.kristal.kotlin

import java.io.File

/**
 * Created by Dwi_Ari on 10/27/17.
 */

class Null{
    fun parseInt(str: StringFormat): Int? {
        return null
    }

    fun printProduct1(arg1: StringFormat, arg2: StringFormat) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // Using `x * y` yields error because they may hold nulls.
        if (x != null && y != null) {
            // x and y are automatically cast to non-nullable after null check
            println(x * y)
        }
        else {
            println("either '$arg1' or '$arg2' is not a number")
        }
    }

    fun printProduct2(arg1: StringFormat, arg2: StringFormat) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if (x == null) {
            println("Wrong number format in arg1: '$arg1'")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: '$arg2'")
            return
        }

        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }

    fun ifNotNull() {
        val files = File("Test").listFiles()
        println(files?.size)
    }

    fun ifNotNullAndElse() {
        val files = File("Test").listFiles()
        println(files?.size ?: "empty")
    }

    fun executingAStatementIfNull() {
        val values = HashMap<String, String>()
        val email = values["email"] ?: throw IllegalStateException("Email is missing!")
    }

    fun executeIfNotNull() {
        val values: HashMap<String, String>? = null
        values?.let {

        }
    }

    fun mapNullableIfNotNull() {
        val values: HashMap<String, String>? = null
//        val mapped = values?.let { transformValue(it) } ?: defaultValueIfValueIsNull
    }
}