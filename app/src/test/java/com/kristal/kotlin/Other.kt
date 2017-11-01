package com.kristal.kotlin

import java.nio.file.Files
import java.nio.file.Paths

/**
 * Created by Dwi_Ari on 11/1/17.
 */

class Function {

    // lazy
    val p: String by lazy {
        // compute the string
        ""
    }


    fun tes() {


        val map = HashMap<String, Int>()
        for ((k, v) in map) {
            println("$k -> $v")
        }

        // read only
        val list = listOf("a", "b", "c")
        val mapof = mapOf("a" to 1, "b" to 2, "c" to 3)

        // akses map
        println(map["key"])
//        map["key"] = value

    }
}

// singleton
object Resource {
    val name = "Name"
}


// call multiple method
class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}

fun a1() {
    val myTurtle = Turtle()
    with(myTurtle) {
        //draw a 100 pix square
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

fun a2() {
    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}

//  public final class Gson {
//     ...
//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
//     ...

//inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)