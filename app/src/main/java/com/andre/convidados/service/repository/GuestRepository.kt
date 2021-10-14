package com.andre.convidados.service.repository

import com.andre.convidados.service.model.GuestModel

//Responsável por salvas os convidados cadastrados
class GuestRepository {
    fun getAll(): List<GuestModel>{
        val list: MutableList<GuestModel> =  ArrayList()
        return list
    }
    fun getPresent(): List<GuestModel>{
        val list: MutableList<GuestModel> =  ArrayList()
        return list
    }
    fun getAbesent(): List<GuestModel>{
        val list: MutableList<GuestModel> =  ArrayList()
        return list
    }

    //CRUD - CREATE, READ, UPDATE, DELETE
fun save(guest: GuestModel){

    }

    fun update(guest: GuestModel){

    }

    fun delete(guest: GuestModel){

    }
}