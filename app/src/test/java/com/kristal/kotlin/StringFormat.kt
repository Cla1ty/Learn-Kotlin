package com.kristal.kotlin

/**
 * Created by Dwi_Ari on 10/27/17.
 */

class StringFormat {
    init {
        var a = 1
        val s1 = "a is $a"
        a = 2
        val s2 = "${s1.replace("is", "was")}, but now is $a"
    }
}
