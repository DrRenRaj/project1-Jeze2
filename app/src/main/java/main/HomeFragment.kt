package main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.msudenver.cs3013.project1_s24.R
import edu.msudenver.cs3013.project1_s24.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.navigateToProfileButton).setOnClickListener {
            findNavController().navigate(R.id.nav_profile)
        }

        view.findViewById<Button>(R.id.navigateToTasksButton).setOnClickListener {
            findNavController().navigate(R.id.nav_tasks)
        }

        view.findViewById<Button>(R.id.navigateToHelpButton).setOnClickListener {
            findNavController().navigate(R.id.nav_help)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
