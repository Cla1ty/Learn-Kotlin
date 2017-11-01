package com.kristal.kotlin

import com.kristal.kotlin.base.vegetables
import org.junit.Test

/**
 * Created by Dwi_Ari on 11/1/17.
 */

class Loop{

    @Test
    fun foreach(){
        vegetables.forEach {
            println(it)
        }

        vegetables.indices.forEach {
            println("item at $it is ${vegetables[it]}")
        }
    }

    @Test
    fun range() {
        // 12345
        for (x in 1..5) {
            print(x)
        }
        println()

        // 1234
        for (x in 1 until 5) {
            print(x)
        }
        println()

        // 13579
        for (x in 1..10 step 2) {
            print(x)
        }

        // 9630
        println()
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
        println()
    }
}