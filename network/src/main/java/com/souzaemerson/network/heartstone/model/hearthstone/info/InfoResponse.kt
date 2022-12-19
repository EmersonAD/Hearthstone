package com.souzaemerson.network.heartstone.model.hearthstone.info


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class InfoResponse(
    @SerializedName("classes")
    val classes: List<String>,
    @SerializedName("factions")
    val factions: List<String>,
    @SerializedName("locales")
    val locales: Locales,
    @SerializedName("patch")
    val patch: String,
    @SerializedName("qualities")
    val qualities: List<String>,
    @SerializedName("races")
    val races: List<String>,
    @SerializedName("sets")
    val sets: List<String>,
    @SerializedName("standard")
    val standard: List<String>,
    @SerializedName("types")
    val types: List<String>,
    @SerializedName("wild")
    val wild: List<String>
): Parcelable