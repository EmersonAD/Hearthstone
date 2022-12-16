package com.souzaemerson.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DisneyResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("nextPage")
    val nextPage: String,
    @SerializedName("totalPages")
    val totalPages: Int
) : Parcelable