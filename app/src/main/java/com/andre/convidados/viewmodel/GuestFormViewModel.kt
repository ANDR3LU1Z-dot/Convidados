package com.andre.convidados.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andre.convidados.service.model.GuestModel
import com.andre.convidados.service.repository.GuestRepository

class GuestFormViewModel: ViewModel() {

    private val mGuestRepository: GuestRepository = GuestRepository()

    //Mutavel
    private var mSaveGuest = MutableLiveData<Boolean>()
    //Imutavel
    val saveGuest: LiveData<Boolean> = mSaveGuest

    fun save(name: String, presence:Boolean){
        val guest = GuestModel(name, presence)
        mGuestRepository.save(guest)
    }
}