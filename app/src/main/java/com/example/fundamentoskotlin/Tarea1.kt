package com.example.fundamentoskotlin

fun main (){
    ran(6)
}

fun ran(num:Int){
    print(  "Tu numero aleatorio del 0 al $num es:\n" +
            "${(0..num).random()}")
}