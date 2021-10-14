package com.andre.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.andre.convidados.viewmodel.GuestFormViewModel
import com.andre.convidados.R
import kotlinx.android.synthetic.main.activity_guest_form.*

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mViewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)

        mViewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        //Eventos
        setListener()

        //Cria Observadores
        observe()
    }

    //Vinculando a view button com o click do botão
    override fun onClick(v: View) {
        val id = v.id
        if (id == R.id.button_save){

            val name = edit_name.text.toString()
            val presence = radio_present.isChecked//Verifica se o radio button foi checado, valor dessa função: boolean
            mViewModel.save(name,presence)
        }
    }

    private fun observe(){
        mViewModel.saveGuest.observe(this, Observer {
            if (it){
                Toast.makeText(applicationContext,"Sucesso!" , Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Falha!" , Toast.LENGTH_SHORT).show()
            }
            finish()
        })
    }

    //Para escutar o clique do botão de salvar
    private fun setListener(){
        button_save.setOnClickListener(this)
    }


}