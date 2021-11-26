package com.example.fundamentoskotlin

fun main (){


    showPersons("Erick","Huitziuit","Morales","Garcia","Perez","Rockefeller")
}

fun showPersons(vararg persons: String): Unit{
    newTopic("For")
    for (person in persons) println(person)

    newTopic("while")
    var i = 0
    while (i<persons.size){
        println(persons[i])
        i++
    }

    newTopic("when")
    //switch case

    var index= (0..persons.size-1).random()
    println("----> ${persons[index]}")
    when(persons[index]){
        "Erick"->println("first name")
        "Huitziuit"->("Second name")
        "Morales"->println("last name")
        "Rockefeller"->{
            print("hello im rockefeller ")
            println(sum(9,60))
        }else-> {
            println("default case ")
        }//default case

    }
}
