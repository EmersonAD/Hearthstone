package com.souzaemerson.network.heartstone.model.hearthstone.info


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Locales(
    @SerializedName("DE_DE")
    val dEDE: String,
    @SerializedName("EN_GB")
    val eNGB: String,
    @SerializedName("EN_US")
    val eNUS: String,
    @SerializedName("ES_ES")
    val eSES: String,
    @SerializedName("ES_MX")
    val eSMX: String,
    @SerializedName("FR_FR")
    val fRFR: String,
    @SerializedName("IT_IT")
    val iTIT: String,
    @SerializedName("JA_JP")
    val jAJP: String,
    @SerializedName("KO_KR")
    val kOKR: String,
    @SerializedName("PL_PL")
    val pLPL: String,
    @SerializedName("PT_BR")
    val pTBR: String,
    @SerializedName("RU_RU")
    val rURU: String,
    @SerializedName("TH_TH")
    val tHTH: String,
    @SerializedName("ZH_CN")
    val zHCN: String,
    @SerializedName("ZH_TW")
    val zHTW: String
) : Parcelable