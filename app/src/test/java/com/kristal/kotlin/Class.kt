package com.kristal.kotlin

import android.util.Log

/**
 * Created by Dwi_Ari on 11/1/17.
 */
open class Person(
        name: String,
        optional: String = ""
) {
    constructor() : this("Nama")

    val customerKey = name.toUpperCase()

    init {
        Log.i("A", "Customer initialized with value $name")
    }

    fun addHobby(hoby :String){}
    fun removeHobby(hoby :String){}
}
