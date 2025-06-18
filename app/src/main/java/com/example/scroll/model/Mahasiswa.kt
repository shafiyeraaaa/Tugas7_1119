package com.example.scroll.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Mahasiswa(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nameResourceId: Int,
    @StringRes val emailResurceId: Int
)
