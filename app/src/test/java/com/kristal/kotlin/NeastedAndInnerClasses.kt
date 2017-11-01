package com.kristal.kotlin

/**
 * Created by Dwi_Ari on 11/1/17.
 */

class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }

    inner class Inner {
        fun foo() = bar
    }
}

val demoNest = Outer.Nested().foo() // == 2
val demoInner = Outer().Inner().foo() // == 1