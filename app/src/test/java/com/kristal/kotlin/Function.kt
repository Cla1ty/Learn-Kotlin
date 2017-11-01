package com.kristal.kotlin

/**
 * Created by Dwi_Ari on 10/27/17.
 */

/**
 * Return type wajib di isi
 * biar tidak membingungkan
 * kecuali Unit
 * sebaiknya dihilangkan
 */

fun returnNormal(a: Int, b: Int): Int {
    return a + b
}

fun returnSingleLine(a: Int, b: Int): Int = a + b

fun returnUnit(a: Int, b: Int) {}

fun optionalParameter(
        a: Int = 0,
        b: String = ""
) {
}