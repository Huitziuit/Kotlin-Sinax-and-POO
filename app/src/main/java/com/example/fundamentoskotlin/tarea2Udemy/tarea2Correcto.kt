package com.example.fundamentoskotlin.tarea2Udemy

fun main(){
    val curse=Course(1,"kotlin","Erick",true)
    curse.subscribe()
}

open class Course (val id: Long, var name: String, var author: String, isPublic: Boolean){

    open fun subscribe(){
        println("¡Enhorabuena! ¿Comenzar curso?")
    }
}