package main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.msudenver.cs3013.project1_s24.R
import edu.msudenver.cs3013.project1_s24.databinding.FragmentTasksBinding

class TasksFragment : Fragment() {
    private var _binding: FragmentTasksBinding? = null
    private val binding get() = _binding!!

    private val tasks = mutableListOf<String>()
    private var selectedTaskIndex: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTasksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.navigateToProfileButton).setOnClickListener {
            findNavController().navigate(R.id.nav_profile)
        }

        binding.addTaskButton.setOnClickListener {
            val task = binding.taskEditText.text.toString()
            if (task.isNotEmpty()) {
                tasks.add(task)
                binding.taskEditText.text.clear()
                updateTaskList()
            }
        }

        binding.taskListTextView.setOnClickListener { view ->
            val index = tasks.indexOf((view as TextView).text.toString())
            if (index != -1) {
                selectedTaskIndex = index
                binding.editTaskEditText.setText(tasks[index])
            }
        }

        binding.updateTaskButton.setOnClickListener {
            selectedTaskIndex?.let { index ->
                tasks[index] = binding.editTaskEditText.text.toString()
                binding.editTaskEditText.text.clear()
                updateTaskList()
            }
        }
    }

    private fun updateTaskList() {
        binding.taskListTextView.text = tasks.joinToString(separator = "\n")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
