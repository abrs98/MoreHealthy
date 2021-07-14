package barrios.abrahan.morehealthy

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DescansoFragment : Fragment() {

    companion object {
        fun newInstance() = DescansoFragment()
    }

    private lateinit var viewModel: DescansoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.descanso_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DescansoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}