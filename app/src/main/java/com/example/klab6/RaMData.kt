package com.example.klab6

import com.google.gson.annotations.SerializedName

data class RaMData(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<RaM>
    )
data class Info(
    @SerializedName("count")
    val count: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("prev")
    val prev: String
    )
data class RaM(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("location")
    val location: Location,
    @SerializedName("image")
    val image: String,
    @SerializedName("url")
    val url: String
    )
data class Origin(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
    )

data class Location(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
    )