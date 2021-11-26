package com.example.fundamentoskotlin.clases

class Smartphone(num: Int, var isPrivate: Boolean, val versionA:String = "kitkat"):Phone(num){




    override fun showNumber() {
        if (isPrivate) println("Unknow") else super.showNumber()
    }

    fun getVersionAndroid():String{
        return versionA
    }
}