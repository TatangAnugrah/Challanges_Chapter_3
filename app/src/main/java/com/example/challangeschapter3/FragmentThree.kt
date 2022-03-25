package com.example.challangeschapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.challangeschapter3.databinding.FragmentThreeBinding


class FragmentThree : Fragment() {

    companion object {
        val DATAEMPAT = "DATAEMPAT"
    }

    private var _binding: FragmentThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFragmentThree.setOnClickListener(){

            val mBundle = Bundle ()
            mBundle.putString(DATAEMPAT, "Binarian  Pertama")
            it.findNavController().navigate(R.id.action_fragmentThree_to_fragmentFour, mBundle)
        }

        val aName = FragmentThreeArgs.fromBundle(arguments as Bundle).name

        binding.tvName.text = "Namanya: $aName"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}