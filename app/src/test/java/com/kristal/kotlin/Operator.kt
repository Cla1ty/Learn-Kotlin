package com.kristal.kotlin

/**
 * Created by Dwi_Ari on 11/2/17.
 */


/**
 *  in !in
 */
operator fun Any.contains(any: Any): Boolean { return true }

/**
 *  < > <= >=
 */
operator fun Any.compareTo(any: Any): Int { return 1 }

/**
 *  /
 */
operator fun Any.div(any: Any) {}

/**
 * Person [] hobby
 */
operator fun Person.get(hobby: String): Boolean {
    return true
}

/**
 * ++
 */
operator fun Any.inc(any: Any) {}

/**
 * Person - hobby
 */
operator fun Person.minus(hobby: String) {
    removeHobby(hobby)
}

/**
 * Person -= hobby
 */
operator fun Person.minusAssign(hobby: String) {
    removeHobby(hobby)
}

/**
 * !
 */
operator fun Any.not() {}

/**
 *  +=
 */
operator fun Person.plusAssign(hobby: String) {
    addHobby(hobby)
}

/**
 * Person + hobby
 */
operator fun Person.plus(hobby: String) {
    removeHobby(hobby)
}

/**
 * ..
 */
operator fun Any.rangeTo(any: Any) {}

/**
 * %
 */
operator fun Any.rem(any: Any) {}

/**
 * %=
 */
operator fun Any.remAssign(any: Any) {}

/**
 * [] = ..
 */
operator fun Person.set(any: Any,any2: Any) {}

/**
 * *
 */
operator fun Any.times(any: Any) {}

/**
 * *=
 */
operator fun Any.timesAssign(any: Any) {}

fun a() {
    val person = Person()
    person += "Hobi"
    person -= "Hobi"
    person + "Hobi"
    person - "Hobi"
    person["a"] = "a"
}


