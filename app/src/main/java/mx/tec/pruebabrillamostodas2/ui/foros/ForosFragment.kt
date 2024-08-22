package mx.tec.pruebabrillamostodas2.ui.foros

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import mx.tec.pruebabrillamostodas2.databinding.FragmentForosBinding

class ForosFragment : Fragment() {

    private var _binding: FragmentForosBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val forosViewModel =
            ViewModelProvider(this).get(ForosViewModel::class.java)

        _binding = FragmentForosBinding.inflate(inflater,container, false)
        val root: View = binding.root

        val textView: TextView = binding.textForos
        forosViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return root
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }
}