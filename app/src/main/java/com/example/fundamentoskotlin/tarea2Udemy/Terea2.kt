package com.example.fundamentoskotlin.tarea2Udemy

fun main (){
    val conductor1= Conductor("Erick",21)
    val v8 = Motor(6,180)
    val v6 = Motor(8, 280)
    val carroceria1=Carroceria("azul",2000.0f)
    val carroceria2=Carroceria("rojo",1000.0f)

    val deportivo=Auto(conductor1,v8,carroceria2)
    val familiar=Auto(conductor1,v6,carroceria1)

    val autos=mutableListOf<Auto>()
    autos.add(deportivo)
    autos.add(familiar)
    println(autos)
}

data class Auto(var conductor : Conductor, var motor: Motor, var carroceria: Carroceria)

data class Conductor(var nombre:String, var edad:Int)
data class Motor(var cilindros:Int, var velocidadMax:Int)
data class Carroceria(var color: String, var peso : Float )