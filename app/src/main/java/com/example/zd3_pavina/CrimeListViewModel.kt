package com.example.zd3_pavina

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0..100) {
            val crime = Crime()
            crime.mTitle = "Crime #$i"
            crime.mSolved = i % 2 == 0
            crimes += crime
        }
    }


}