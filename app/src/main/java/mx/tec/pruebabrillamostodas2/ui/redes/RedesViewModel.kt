package mx.tec.pruebabrillamostodas2.ui.redes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RedesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is redes fragment"
    }
    val text: LiveData<String> = _text
}