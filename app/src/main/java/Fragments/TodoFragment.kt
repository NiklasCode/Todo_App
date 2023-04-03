package Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todokotlin.R
import com.example.todokotlin.databinding.FragmentTodo2Binding


class TodoFragment : Fragment() {
    private lateinit var binding: FragmentTodo2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentTodo2Binding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnMenu.setOnClickListener{
                val direction = TodoFragmentDirections.actionTodoFragmentToMenuFragment()
                findNavController().navigate(direction)
            }
        }

    }
}