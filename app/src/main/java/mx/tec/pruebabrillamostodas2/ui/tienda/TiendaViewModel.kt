package mx.tec.pruebabrillamostodas2.ui.tienda

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class TiendaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply{
        value = "This is Tienda Fragment"
    }

    val text: LiveData<String> = _text
}