package com.kristal.kotlin

import com.kristal.kotlin.base.vegetables

/**
 * Created by Dwi_Ari on 11/1/17.
 */

class Collection {
    fun a() {
        vegetables
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }

        // filter list
        val list = ArrayList<Int>()
        val positives = list.filter { it > 0 }
    }
}