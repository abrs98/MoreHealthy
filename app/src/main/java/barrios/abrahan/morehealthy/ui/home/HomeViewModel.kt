<<<<<<< HEAD
package barrios.abrahan.morehealthy.ui.home
=======
package valenzuela.carlos.morehealthy.ui.home
>>>>>>> 1fe4d1c6a05bb06e76bf90cf583256809137fa96

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}