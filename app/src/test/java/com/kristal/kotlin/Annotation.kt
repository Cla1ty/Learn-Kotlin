package com.kristal.kotlin

import kotlin.reflect.KClass

/**
 * Created by Dwi_Ari on 11/1/17.
 */

/**
The full list of supported use-site targets is:

file;
property (annotations with this target are not visible to Java);
field;
get (property getter);
set (property setter);
receiver (receiver parameter of an extension function or property);
param (constructor parameter);
setparam (property setter parameter);
delegate (the field storing the delegate instance for a delegated property).
 */

@Target(AnnotationTarget.CLASS,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER,
        AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Settings(
        val id: Int
)

@Settings(0)
class Foo {}

annotation class ReplaceWith(val expression: String)

annotation class Deprecated(
        val message: String,
        val replaceWith: ReplaceWith = ReplaceWith(""))

@Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))


        // ===

annotation class Ann(val arg1: KClass<*>, val arg2: KClass<out Any>)

@Ann(String::class, Int::class) class MyClass

// =============
//class Example(@field:Ann val foo,    // annotate Java field
//              @get:Ann val bar,      // annotate Java getter
//              @param:Ann val quux)   // annotate Java constructor parameter