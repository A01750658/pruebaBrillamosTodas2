package mx.tec.pruebabrillamostodas2.ui.redes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.tec.pruebabrillamostodas2.databinding.FragmentRedesBinding

class RedesFragment : Fragment() {

    private var _binding: FragmentRedesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val redesViewModel =
            ViewModelProvider(this).get(RedesViewModel::class.java)

        _binding = FragmentRedesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textRedes
        redesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}