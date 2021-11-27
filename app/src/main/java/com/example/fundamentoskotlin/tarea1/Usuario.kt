package com.example.fundamentoskotlin.tarea1

abstract class Usuario (var name:String, var lastName:String, val id:Int):Persona{
    override fun getPersonalData() {
        println("Usuario $name $lastName, con ID $id")
    }

    override fun setPersonalData(name: String, lastName: String) {
        this.name=name
        this.lastName=lastName
    }

    open fun actionsInPlatform(service:String){
        println("Use service $service")
    }

    abstract fun permissions()
}