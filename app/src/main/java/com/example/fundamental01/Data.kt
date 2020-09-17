package com.example.fundamental01

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data (
    var name: String?,
    var rank: String?,
    var photo: String?,
    var overview: String?,
    var identity: String?

) : Parcelable