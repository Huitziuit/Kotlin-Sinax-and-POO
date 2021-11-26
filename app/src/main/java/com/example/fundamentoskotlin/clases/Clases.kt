package com.example.fundamentoskotlin.clases

import com.example.fundamentoskotlin.newTopic

fun main(){

    newTopic("Clases")
    val phone: Phone = Phone(123456)
    //println(phone.number) Protected me impode acceder directamente
    phone.showNumber()
    phone.call()

    newTopic("Herencia")
    val smartphone = Smartphone(9876543, true)
    println("version de Android ${smartphone.getVersionAndroid()}")

    newTopic("sobreescribir metodos")
    smartphone.showNumber()

    newTopic("Data Class")
    val user = User(1,"Huitziuit", "Morales", 69)
    println(user.component2())

    newTopic("Enum class")
    val sister = user.copy(2,"Abril", group = Group.FAMILY.ordinal)
    println(sister)

    newTopic("Funciones de alcance")
    with(smartphone){
        println("Es privado $isPrivate")
        call()
    }

    sister.apply {
        lastName="Dominguez"
        print(this)
    }
}