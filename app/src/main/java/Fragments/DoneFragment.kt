package Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todokotlin.R
import com.example.todokotlin.databinding.FragmentDoneBinding


class DoneFragment : Fragment() {

    private lateinit var binding: FragmentDoneBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentDoneBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnToMenu.setOnClickListener {
                val direction = DoneFragmentDirections.actionDoneFragmentToMenuFragment()
                findNavController().navigate(direction)
            }
        }

    }
}