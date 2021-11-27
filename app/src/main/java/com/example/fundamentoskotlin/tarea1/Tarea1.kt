package com.example.fundamentoskotlin.tarea1

fun main (){
    val mySmartphone= Smartphone(123456789)

    println("My number is: ${mySmartphone.getNum()}")
    mySmartphone.navInternet()

    val firstUser = AndroidUser("Erick","Morales Garcia", 1)
    firstUser.actionsInPlatform("Facebook")
}