package net.iessochoa.jesusayala.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    //var contador:Int =0
    private val contador = MutableLiveData<Int>(0)
    fun sumaUno(){
        contador.value = contador.value?.plus(1)
    }

    private val asteriscos=MutableLiveData<String>("")
    fun sumarAsterisco() {
        asteriscos.value = asteriscos.value.plus("*")
    }

    fun getAstericos(): LiveData<String> {
        return asteriscos
    }

    fun getContador(): LiveData<Int> {
        return contador
    }

}