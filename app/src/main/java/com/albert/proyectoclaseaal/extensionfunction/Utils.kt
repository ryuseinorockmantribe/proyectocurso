package com.albert.proyectoclaseaal.extensionfunction

import com.albert.proyectoclaseaal.recycler.data.UserItem


fun List<com.albert.proyectoclaseaal.retrofit.Result>.toUserItemList():List<UserItem>{

    val userItemList = mutableListOf<UserItem>()

    this.forEach {
        userItemList.add(it.toUserItem())
    }

    return userItemList

}