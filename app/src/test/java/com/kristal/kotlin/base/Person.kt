package com.kristal.kotlin.base

/**
 * Created by Dwi_Ari on 11/1/17.
 */

class Person(
        val name: String? = null,
        val age: Int = 10
) {
    operator fun component1(): String? {
        return name
    }

    operator fun component2(): Int {
        return age
    }
}
