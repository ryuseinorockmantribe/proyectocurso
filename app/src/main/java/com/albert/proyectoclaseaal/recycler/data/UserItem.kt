package com.albert.proyectoclaseaal.recycler.data

data class UserItem(
    val name : String = "Sin nombre",
    val age : Int = 0,
    val imageURLValue : String = "Empty",
    val address : Address = Address(),
    val origen : String = "",
    val tipo : String = ""
)

