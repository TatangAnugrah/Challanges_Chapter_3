package com.example.challangeschapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.challangeschapter3.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    private var _binding : FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment - Diganti dengan binding
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFragmentTwo.setOnClickListener{

            if (binding.etNama.text.isNullOrEmpty()){
                //Menampilkan Toast
                Toast.makeText(requireContext(), "Kolom Nama Masih Kosong", Toast.LENGTH_SHORT).show()
            }
            else {
                val actionToFragmentThree =
                    //Mengirimkan data etNama
                    FragmentTwoDirections.actionFragmentTwoToFragmentThree(binding.etNama.text.toString())
                view.findNavController().navigate(actionToFragmentThree)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}