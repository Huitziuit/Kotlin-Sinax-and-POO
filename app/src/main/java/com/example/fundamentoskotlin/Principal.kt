package com.example.fundamentoskotlin

const val line="===============" //guarda en tiempo de compilaciony no de ejecucion, solo admite valores primitivos y globales

fun main(){
    newTopic("Hello Kotlin")


    var a = 4
}

fun newTopic(topic: String){
    /*
    println()
    print("=============== ")
    print(topic)
    println(" ===============")
    */
    //println("\n=============== $topic ===============")
    println("$line $topic $line")



}