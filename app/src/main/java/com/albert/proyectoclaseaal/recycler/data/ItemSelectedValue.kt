package com.albert.proyectoclaseaal.recycler.data

object ItemSelectedValue {

    private var userItemSelected = UserItem()

    init {
        userItemSelected = UserItem()
    }

    fun clearUser() {
        userItemSelected = UserItem()
    }

    fun selectUser(user : UserItem){
        userItemSelected = user
    }

    fun getUser() = userItemSelected

}