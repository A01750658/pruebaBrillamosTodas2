package mx.tec.pruebabrillamostodas2.ui.foros

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class ForosViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply{
        value = "This is foros fragment"
    }
    val text: LiveData<String> = _text
}