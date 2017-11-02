package com.kristal.kotlin

/**
 * Created by Dwi_Ari on 11/2/17.
 */

fun optional(message:String = "success"){

}

fun array(vararg message: String){

}

fun <T> genericClass(clazz: Class<T>){

}


fun test(){
    genericClass(Person::class.java)
}