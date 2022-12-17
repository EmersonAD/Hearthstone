package com.souzaemerson.data.model.hearthstone.card.byclass


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CardResponseItem(
    @SerializedName("armor")
    val armor: String,
    @SerializedName("artist")
    val artist: String,
    @SerializedName("attack")
    val attack: Int,
    @SerializedName("cardId")
    val cardId: String,
    @SerializedName("cardSet")
    val cardSet: String,
    @SerializedName("classes")
    val classes: List<String>,
    @SerializedName("collectible")
    val collectible: Boolean,
    @SerializedName("cost")
    val cost: Int,
    @SerializedName("dbfId")
    val dbfId: Int,
    @SerializedName("durability")
    val durability: Int,
    @SerializedName("elite")
    val elite: Boolean,
    @SerializedName("faction")
    val faction: String,
    @SerializedName("flavor")
    val flavor: String,
    @SerializedName("health")
    val health: Int,
    @SerializedName("howToGet")
    val howToGet: String,
    @SerializedName("howToGetDiamond")
    val howToGetDiamond: String,
    @SerializedName("howToGetGold")
    val howToGetGold: String,
    @SerializedName("img")
    val img: String,
    @SerializedName("imgGold")
    val imgGold: String,
    @SerializedName("locale")
    val locale: String,
    @SerializedName("mechanics")
    val mechanics: List<Mechanic>,
    @SerializedName("multiClassGroup")
    val multiClassGroup: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("otherRaces")
    val otherRaces: List<String>,
    @SerializedName("playerClass")
    val playerClass: String,
    @SerializedName("race")
    val race: String,
    @SerializedName("rarity")
    val rarity: String,
    @SerializedName("spellSchool")
    val spellSchool: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("type")
    val type: String
): Parcelable