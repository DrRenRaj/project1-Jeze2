package main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import edu.msudenver.cs3013.project1_s24.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    private val viewModel: SharedViewModel by activityViewModels()
    private var _binding: Fragment2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.message.observe(viewLifecycleOwner, Observer { message ->
            binding.tvMessage.text = message
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
