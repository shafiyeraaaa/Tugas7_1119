package com.example.scroll.data

import com.example.scroll.R
import com.example.scroll.model.Mahasiswa

class MahasiswaSource {
    fun loadMahasiswa () : List<Mahasiswa> {
        return listOf<Mahasiswa>(
            Mahasiswa(R.drawable.mhs1, R.string.mhs1, R.string.email_mhs1),
            Mahasiswa(R.drawable.mhs2, R.string.mhs2, R.string.email_mhs2),
            Mahasiswa(R.drawable.mhs3, R.string.mhs3, R.string.email_mhs3),
            Mahasiswa(R.drawable.mhs4, R.string.mhs4, R.string.email_mhs4),
            Mahasiswa(R.drawable.mhs5, R.string.mhs5, R.string.email_mhs5),
        )
    }

}