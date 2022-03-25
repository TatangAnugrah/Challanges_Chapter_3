package com.example.challangeschapter3

import android.app.Person
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.challangeschapter3.databinding.FragmentFourBinding
import com.example.challangeschapter3.databinding.FragmentThreeBinding

class FragmentFour : Fragment() {

    companion object {
        val DATAEMPAT = "DATAEMPAT"
    }

    private var _binding: FragmentFourBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFragmentFour.setOnClickListener {
            val usia = Integer.parseInt(binding.etUsia.text.toString())
            fun cek():String{
                return if(usia % 2 == 0){
                    "usianya genap"
                }else{
                    "usianya ganjil"
                }
            }

            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

//siapa yang suka melon ??
//ini lagi ngetes github ya ka..
//soalnya eror mulu