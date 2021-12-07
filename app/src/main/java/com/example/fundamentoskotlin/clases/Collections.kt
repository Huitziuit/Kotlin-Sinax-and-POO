package com.example.fundamentoskotlin.clases

import com.example.fundamentoskotlin.newTopic

fun main() {
    newTopic("collections")
    newTopic("solo lectura")

    val frutasList= listOf("manzana","naranje","uva"); //Estas colecciones no se pueden editar

    println(frutasList.get((0..frutasList.size-1).random()))
    println(frutasList.indexOf("uva"))

    newTopic("Mutable List")

    val user = User(1,"Huitziuit", "Morales", 69)
    val sister = user.copy(2,"Abril", group = Group.FAMILY.ordinal)
    var friend = user.copy(3, "Apa", group = Group.FRIENDS.ordinal)

    val usersList = mutableListOf<User>(user, sister) //el <User es redundante >

    println(usersList)
    usersList.add(friend)
    println(usersList)
    usersList.remove(friend)
    println(usersList)

    val userSelectedList = mutableListOf<User>();
    println(userSelectedList)
    userSelectedList.add(user)
    println(userSelectedList)
    userSelectedList.set(0, friend)
    println(userSelectedList)
    userSelectedList.add(user)
    userSelectedList.add(user)
    userSelectedList.add(user)
    println(userSelectedList)

    newTopic("Map")

    val usersMap = mutableMapOf<Int, User>()
    println(usersMap)
    usersMap.put(user.id.toInt(), user)
    usersMap.put(user.id.toInt(), user)  //los mapas no permiten valores repetidos
    println(usersMap)
    usersMap.put(friend.id.toInt(),friend)
    println(usersMap)
    usersMap.remove(3)
    println(usersMap)
    println(usersMap.isEmpty()) //nos dice si esta vacia
    usersMap.put(friend.id.toInt(),friend)
    usersMap.put(sister.id.toInt(),sister)
    println(usersMap.keys)
    println(usersMap.values)

}