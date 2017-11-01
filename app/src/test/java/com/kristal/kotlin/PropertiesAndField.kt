package com.kristal.kotlin

import com.kristal.kotlin.base.Person

/**
 * Created by Dwi_Ari on 11/1/17.
 */

class PropertiesAndField {

    fun a() {
        val (name, age) = Person()
    }

    // custom get set
    var stringRepresentation: String = ""
        get() = this.toString()
        set(value) {
            if (value.length >= 0)
                field = value
        }
}