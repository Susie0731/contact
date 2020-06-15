package com.example.myapplication.contact

import java.io.Serializable

class Contact constructor(name: String, number: String, pic: Int):Serializable {
    val name:String
    val number:String
    val pic:Int
    init{
        this.name = name
        this.number = number
        this.pic = pic
    }
}