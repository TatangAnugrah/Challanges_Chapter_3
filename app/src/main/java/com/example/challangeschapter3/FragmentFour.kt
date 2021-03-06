package com.example.challangeschapter3

import android.app.Person
import android.content.Intent
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
        val Data = "data"
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

            if (binding.etAlamat.text.isNotEmpty() && binding.etKerja.text.isNotEmpty() && binding.etUsia.text.isNotEmpty()){

                val alamat = binding.etAlamat.text.toString()
                val pekerjaan = binding.etKerja.text.toString()
                val usia = binding.etUsia.text.toString().toInt()

                val data = Data(alamat, pekerjaan, usia)

                val intent = Intent(this, FragmentThreeBinding::class.java)
                intent.putExtra(Data, "usia", usia, "alamat", alamat, "pekerjaan", pekerjaan)
                startActivity(intent)
            }

            findNavController().navigateUp()
        }
    }

    private fun Intent(fragmentFour: FragmentFour, java: Class<FragmentThreeBinding>): Intent? {
        TODO("Not yet implemented")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

private fun Intent?.putExtra(
    data: String,
    s: String,
    usia: Int,
    s1: String,
    alamat: String,
    s2: String,
    pekerjaan: String
) {
    TODO("Not yet implemented")
}

//siapa yang suka melon ??
//ini lagi ngetes github ya ka..
//soalnya eror mulu