package com.kristal.kotlin

import com.kristal.kotlin.base.Person
import org.junit.Test

/**
 * Created by Dwi_Ari on 11/1/17.
 */

/**

Kotlin has three structural jump expressions:

return. By default returns from the nearest enclosing function or anonymous function.
break. Terminates the nearest enclosing loop.
continue. Proceeds to the next step of the nearest enclosing loop.

 */

class ReturnAndJumps {
    val person = Person("Smith")

    @Test
    fun nullReturn() {
        val person = Person()
        val s = person.name ?: return

        println("Tidak terpanggil")
    }

    @Test
    fun break1() {

        loop@ for (i in 1..10) {
            for (j in 1..10) {
                if (j == 2) break@loop
                println(i)
            }
            println("tidak terpanggil")
        }

        println("terpanggil")
    }

    @Test
    fun return1() {
        (1..10).forEach lit@ {
            if (it == 3) return@lit
            // hanya angka 3 yg tidak terpanggil
            print(it)
        }
        println("terpanggil")
    }

    @Test
    fun return2() {
        (1..10).forEach {
            if (it == 3) return@forEach
            // hanya angka 3 yg tidak terpanggil
            print(it)
        }
        println("terpanggil")
    }

    @Test
    fun return3() {
        (1..10).forEach(fun(value: Int) {
            if (value == 3) return
            // hanya angka 3 yg tidak terpanggil
            print(value)
        })
        println("terpanggil")
    }
}
