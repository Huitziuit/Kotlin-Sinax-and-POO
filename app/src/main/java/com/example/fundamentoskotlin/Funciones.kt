package com.example.fundamentoskotlin

import kotlin.math.abs

fun main(){

    val a = 10
    val b = 20

    println("$a + $b = ${sum(a, b)}")
    println("$a - $b = ${res(a, b)}")
    val c = res(a, b)

    println("Enable abs ${c.enableAbs(true)}")

    //-----------------------------

    product()
    product("VideoGame")
    product("Smartphone","999.00")
    product(name = "clook", time = "2025")

}

fun sum(a:Int, b:Int): Int{
    return a+b;
}
fun res(a:Int, b:Int) = a-b;

//Agrega una funcion a un objeto, Abs= absolut
infix fun Int.enableAbs(enable: Boolean)=if (enable) abs(this) else this

//sobrecarga de metodos

fun product(name:String="default", price: String="free", time:String="2022"){
    println("$name, $price, $time")
}