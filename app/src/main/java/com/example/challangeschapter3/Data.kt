package com.example.challangeschapter3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Data (
    val alamat: String,
    val pekerjaan: String,
    val usia: Int
        ): Parcelable