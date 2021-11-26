package com.example.fundamentoskotlin.clases

open class Phone (protected var number:Int) {   //protected number solo es accesible por esta clase y por sus hijos

    fun call(){
        println("calling... ")
    }

    open fun showNumber(){
        println("My number is $number")
    }

}