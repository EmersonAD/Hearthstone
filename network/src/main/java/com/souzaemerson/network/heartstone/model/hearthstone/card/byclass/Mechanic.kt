package com.souzaemerson.network.heartstone.model.hearthstone.card.byclass


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mechanic(
    @SerializedName("name")
    val name: String
): Parcelable