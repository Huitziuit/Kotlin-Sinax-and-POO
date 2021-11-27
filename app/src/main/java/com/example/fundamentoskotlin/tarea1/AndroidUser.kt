package com.example.fundamentoskotlin.tarea1

class AndroidUser(name :String, lastName:String, id:Int):Usuario(name, lastName, id) {
    private var permission:String = "Admin"

    class App(private var app: String){
        fun useApp(){
            println("Using App $app...")
        }
    }

    override fun actionsInPlatform(app: String) {
        super.actionsInPlatform("Phone")
        println("navigate in Apps...")
        val myApp=App(app)
        myApp.useApp()
    }

    override fun permissions() {
        println("Permissions: $permission")
    }

}